package com.qa.render;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import android.content.res.AssetManager;

/**
 * This class is used to handle xml parsing
 * 
 */
public class HandleXML {
	/* Used for storing question from the xml file */
	private String question = "question";

	// Used for storing after question text for inline choice category
	private String afterQuestionText="";
	
	/// Used for getting after question text 
	public String getAfterQuestion() {
		return afterQuestionText;
	}

	/* Used for storing responce choices from the xml file */
	private List<String> choicesList = new ArrayList<String>();
	/* Used for storing correct choice from the xml file */
	private ArrayList<String> correctResponse = new ArrayList<String>();

	/* Used for storing choice identifer from the xml files */
	private List<String> choiceIdentfier = new ArrayList<String>();

	/** Getter for the choice Identifier */
	public List<String> getChoiceIdentfier() {
		return choiceIdentfier;
	}

	/* Used for storing question title from the xml file */
	private String quesTitle = "";

	/* Used for storing URL of xml file */
	private static String finalUrl;

	/**
	 * Setter for URL of xml file
	 * 
	 * @param url
	 *            -Final url of xml
	 */
	public void setFinalUrl(String url) {
		finalUrl = url;
	}

	/* Used for storing XmlPullParserFactory instance */
	private XmlPullParserFactory xmlFactoryObject;

	/* Flag to check if parsing is complete */
	public volatile boolean parsingComplete = true;
	/*Used to store image name from the xml*/
	private String image;
	/*Used to store Choice type*/
	private String chType;
	/**Getter for choice type*/
	public String getChType() {
		return chType;
	}

	/**
	 * Constructor
	 */
	public HandleXML() {

	}
	/**Getter for Correct response*/
	public ArrayList<String> getCorrectResponse() {
		return correctResponse;
	}
	/**Getter for question*/
	public String getQuestion() {
		return question;
	}
	/**Getter for image link*/
	public String getImage() {
		return image;
	}
	/**Getter for question title*/
	public String getQuesTitle() {
		return quesTitle;
	}
	/**Getter for Choice list*/
	public List<String> getChoicesList() {
		return choicesList;
	}
	/**function to parse XML and store data in respective variables*/
	public void parseXMLAndStoreIt(XmlPullParser myParser) {
		// store xml event
		int event;
	    // store text read from xml
		String text = null;
		
		
		boolean rubricBlockFound=false;
		boolean correctResponseFound=false;
		boolean inlineChoiceFound=false;
		boolean blockQuoteFound=false;

		try {
			event = myParser.getEventType();
			// read the xml till end of the file and store each parsed items in respective variables.			
			while (event != XmlPullParser.END_DOCUMENT) {
				String name = myParser.getName();
				switch (event) {
				case XmlPullParser.START_TAG:
					if (name.equals("assessmentItem")) {
						chType = myParser.getAttributeValue(null, "identifier");
					} else if (name.equals("simpleChoice")) {
						choiceIdentfier.add(myParser.getAttributeValue(null, "identifier"));
						//all choices for response
						myParser.next();
						choicesList.add(myParser.getText());
					} else if (chType.equals("inlineChoice") && name.equals("itemBody")) {
						inlineChoiceFound=true;
						
					} else if (name.equals("rubricBlock")){
						rubricBlockFound=true;
					} else if (name.equals("correctResponse")){
						correctResponseFound=true;
					} else if (name.equals("blockquote")) {
						blockQuoteFound=true;
					} else if (name.equals("prompt")) {
						myParser.next();
						question = myParser.getText();
					} else if (name.equals("title")) {
						//question title
						myParser.next();
						quesTitle = myParser.getText();
					} else if (inlineChoiceFound && name.equals("p")) {
						inlineChoiceFound=false;
						//question title
						myParser.next();
						quesTitle = myParser.getText();
					} else if (blockQuoteFound && name.equals("p")) {
						blockQuoteFound=false;
						//question title
						myParser.next();
						question = myParser.getText()+"\n";
						getInnerXml(myParser);
					} else if (name.equals("img")) {
						//image link from xml
						image = myParser.getAttributeValue(null, "src");
					} else if (rubricBlockFound && name.equals("p")) {
						//question title
						quesTitle = text;
					} else if (correctResponseFound && name.equals("value")) {
						//correct response
						myParser.next();
						correctResponse.add(myParser.getText());
						
					} else {
						// unimplemented
					}
					break;
				case XmlPullParser.TEXT:
					//get text from xml
					text = myParser.getText();
					break;
				case XmlPullParser.END_TAG:
					if (name.equals("correctResponse")) {
						correctResponseFound=false;
					}
					break;
				}
				event = myParser.next();

			}

			parsingComplete = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * get text from nested tags 
	 */
	public void getInnerXml(XmlPullParser parser)
	        throws XmlPullParserException, IOException {
		boolean questionLoaded=false;
	    StringBuilder sb = new StringBuilder();
	    StringBuilder afterQuestion = new StringBuilder();
	    int depth = 1;
	    loop: while (depth != 0) {
	        switch (parser.next()) {
	        case XmlPullParser.END_TAG:
	            depth--;
	            if(parser.getName().equals("blockquote")){
	            	break loop;
	            }
	            break;
	        case XmlPullParser.START_TAG:
	            depth++;
	            
	            if(parser.getName().equals("inlineChoiceInteraction"))
	            {
	            	questionLoaded=true;
	            } else if(parser.getName().equals("inlineChoice")) {
	            	choiceIdentfier.add(parser.getAttributeValue(null,"identifier"));
	            	//all choices for response
	            	parser.next();
	            	choicesList.add(parser.getText());
	            	
	            } 
	            
	            break;
	        default:
	        	if(questionLoaded)
	        		afterQuestion.append(parser.getText().trim());
	        	else
	        		sb.append(parser.getText().trim());
	            break;
	        }
	    }
	    String content;
	    if(questionLoaded) {
		    afterQuestionText=afterQuestion.toString();
	    }
	    else {
	    	content = sb.toString();
		    question = question + content;
	    	
	    }
	}
	
	/**Used to fetch xml for parsing*/
	public void fetchXML(AssetManager assetManager) {

		try {

			// InputStream stream = assetManager.open("Files/choice_fixed.xml");
			InputStream stream = assetManager.open(finalUrl);
			//xml parser factory object
			xmlFactoryObject = XmlPullParserFactory.newInstance();
			//parser object
			XmlPullParser myparser = xmlFactoryObject.newPullParser();
			myparser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
			myparser.setInput(stream, null);
			// start parsing and storing
			parseXMLAndStoreIt(myparser);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}