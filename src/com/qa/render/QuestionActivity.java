package com.qa.render;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.qa.database.ResultDatabase;

import com.qa.render.R;
import com.qa.render.utils.Constants;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.qa.database.Constants.*;

/**
 *This class is corresponding to question display screen
 *used to show question and options.
 *
 */
public class QuestionActivity extends Activity {

	String ques = "Question";
	private String quesTitle = null;
	private String afterQuestionText="";
	RadioGroup radioChoiceGroup;
	private RadioButton selectedRadioButton;
	private List<String> choices;
	private List<String> choicesIdentifier;
	private ImageView iv;
	private TextView tvQuesTitle;
	private AssetManager assetManager;
	private TextView tvQues;
	private LinearLayout layoutImg;
	private String choiceType;
	private CheckBox chkBox;
	private Spinner inlineChoiceSpinner;
	private int radioButtonIdCounter = 0;
	
	private int questionId;
	private String userId;
	private String userResponse;
	private String correctResponse = "";
	private ArrayList<String> correctResponseList=new ArrayList<String>();
	private String questionCategory= "";
	private boolean responseCorrectness;
	private String testDate="";
	
	private String entryTime="";
	private String endTime="";
	private String durationAccumulated="";
	private int initialized=0;
	private int responded=0;
	private String sessionStatus="";
	private String numAttempts="";
	private String completionStatus="";
	private String score="";
	private String response="";
	

	private Calendar startTimeQuestionCal;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question);

		tvQuesTitle = (TextView) findViewById(R.id.tvQuesTitle);
		tvQues = (TextView) findViewById(R.id.tvQues2);
		layoutImg = (LinearLayout) findViewById(R.id.LinearLayoutImg);
		assetManager = getAssets();

		// to get start time of this question
		getStartTimeOfQuestion();
		
		open();

	}

	private void getStartTimeOfQuestion() 
	{
		startTimeQuestionCal=Calendar.getInstance();
		
		int day=startTimeQuestionCal.get(Calendar.DAY_OF_MONTH);
		int month=startTimeQuestionCal.get(Calendar.MONTH);
		int year=startTimeQuestionCal.get(Calendar.YEAR);
		
		int hour=startTimeQuestionCal.get(Calendar.HOUR_OF_DAY);
		int minute=startTimeQuestionCal.get(Calendar.MINUTE);
		int seconds=startTimeQuestionCal.get(Calendar.SECOND);
		
		startTimeQuestionCal.set(year, month, day, hour, minute, seconds);
		
		entryTime=year + "-" + month + "-" + day + " " + hour + " " + minute + " " + seconds;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.question, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void open() {
		HandleXML handleXmlObj = new HandleXML();
		AssetManager assetManager = getAssets();
		
		// uses the url obtained and parses the xml with that url and stores it
		handleXmlObj.fetchXML(assetManager);

		quesTitle = handleXmlObj.getQuesTitle();
		afterQuestionText= handleXmlObj.getAfterQuestion();
		choices = handleXmlObj.getChoicesList();
		choicesIdentifier = handleXmlObj.getChoiceIdentfier();
		ques = handleXmlObj.getQuestion();
		correctResponseList=handleXmlObj.getCorrectResponse();
		choiceType=handleXmlObj.getChType();
		showChoices(choiceType, choices);
		tvQuesTitle.setText("Type:" + choiceType + "\n" + quesTitle);
		tvQues.setText(ques.trim());

		try {
			String img = handleXmlObj.getImage();
			InputStream in = assetManager.open(img);
			if (in != null) {
				iv = new ImageView(this);
				Drawable d = Drawable.createFromStream(in, null);
				iv.setImageDrawable(d);
				layoutImg.addView(iv);
			}

		} catch (Exception e) {
			// TODO: handle exception
			return;
		}

	}

	public void btnSubmit(View view) {
		// set user id
		userId=App.appPrefs.getString(Constants.USERNAME, "");

		// store category
		questionCategory=choiceType;
		
		// store correct response
		if(correctResponseList.size()==1)
			correctResponse=correctResponseList.get(0);
		
		if (choiceType.equals("choice") 
				|| choiceType.equals("hint") 
					|| choiceType.equals("questionnaire")
						|| choiceType.equals("math")
							|| choiceType.equals("SVG")) {
			int selectedId;
			radioChoiceGroup = (RadioGroup) findViewById(R.id.radioChoice);
			selectedId = radioChoiceGroup.getCheckedRadioButtonId();
			selectedRadioButton = (RadioButton) findViewById(selectedId);

			if(selectedRadioButton!=null)
			{
				// store user response
				userResponse=choicesIdentifier.get(selectedId);

				if (choicesIdentifier.get(selectedRadioButton.getId()).equals(correctResponse) && !correctResponse.equals("")) 
				{
					responseCorrectness=true;
					Toast.makeText(getApplicationContext(), "Correct Answer",
							Toast.LENGTH_LONG).show();

				} 
				// for likert.xml every response should be considered as true
				else if(choicesIdentifier.get(selectedRadioButton.getId()).equals("L1")
						|| choicesIdentifier.get(selectedRadioButton.getId()).equals("L2")
						|| choicesIdentifier.get(selectedRadioButton.getId()).equals("L3")
						|| choicesIdentifier.get(selectedRadioButton.getId()).equals("L4")
						|| choicesIdentifier.get(selectedRadioButton.getId()).equals("L5")){
					responseCorrectness=true;
					// show user he/she has made a choice
					Toast.makeText(getApplicationContext(), "Feedback Stored", Toast.LENGTH_LONG).show();
				}
				else  {
					responseCorrectness=false;
					Toast.makeText(getApplicationContext(), "Wrong Answer",
							Toast.LENGTH_LONG).show();
				}
				// get test date and get the end time as well
				testDate=getTestTakenDateAndEndTime();

				// add all the fields to database
				addFieldsToDatabase();

				displayResultActivity();
			}
		} else if(choiceType.equals("inlineChoice")){
			// save user response
			userResponse=choicesIdentifier.get(inlineChoiceSpinner.getSelectedItemPosition());
			
			// check user response with the correct response
			if(userResponse.equals(correctResponse)){
				responseCorrectness=true;
				Toast.makeText(getApplicationContext(), "Correct Answer",Toast.LENGTH_LONG).show();
			}
			else{
				responseCorrectness=false;
				Toast.makeText(getApplicationContext(), "Wrong Answer",Toast.LENGTH_LONG).show();
			}

			// get test date and get the end time as well
			testDate=getTestTakenDateAndEndTime();

			// add all the fields to database
			addFieldsToDatabase();

			displayResultActivity();
		} else if(choiceType.equals("choiceMultiple")){
			int chkedId = 0;
			boolean flag = false;
			radioChoiceGroup = (RadioGroup) findViewById(R.id.radioChoice);

			// store correct response
			correctResponse="H~O";

			for (int id = 0; id < radioChoiceGroup.getChildCount(); id++) {
				chkBox = (CheckBox) radioChoiceGroup.getChildAt(id);


				if (chkBox.isChecked()) {
					chkedId = id;

					// store user response
					userResponse=choicesIdentifier.get(id);

					if (choicesIdentifier.get(id).equals("H")
							|| choicesIdentifier.get(id).equals("O")) {

						flag = true;
					}
				}
			}
			if (flag) {
				responseCorrectness=true;
				Toast.makeText(getApplicationContext(), "Correct Answer",
						Toast.LENGTH_LONG).show();
				// get test date and get the end time as well
				testDate=getTestTakenDateAndEndTime();

				// add all the fields to database
				addFieldsToDatabase();

				displayResultActivity();
			} else {
				responseCorrectness=false;
				Toast.makeText(getApplicationContext(), "Wrong Answer",
						Toast.LENGTH_LONG).show();
			}
		}



	}

	private void displayResultActivity() 
	{
		Intent resultActivityIntent=new Intent(getApplicationContext(), ResultActivity.class);
		resultActivityIntent.putExtra("userId", userId);
		resultActivityIntent.putExtra("userResponse", userResponse);
		resultActivityIntent.putExtra("correctResponse", correctResponse);
		resultActivityIntent.putExtra("questionCategory", questionCategory);
		if(responseCorrectness)
			resultActivityIntent.putExtra("responseCorrectness", 1);
		else
			resultActivityIntent.putExtra("responseCorrectness", 0);
		resultActivityIntent.putExtra("testDate", testDate);
		
		resultActivityIntent.putExtra("entryTime", entryTime);
		resultActivityIntent.putExtra("endTime", endTime);
		resultActivityIntent.putExtra("durationAccumulated", durationAccumulated);
		resultActivityIntent.putExtra("initialized", initialized);
		resultActivityIntent.putExtra("responded", responded);
		resultActivityIntent.putExtra("sessionStatus", sessionStatus);
		resultActivityIntent.putExtra("numAttempts", numAttempts);
		resultActivityIntent.putExtra("completionStatus", completionStatus);
		resultActivityIntent.putExtra("score", score);
		resultActivityIntent.putExtra("response", response);
		
		
		startActivity(resultActivityIntent);
		
	}

	private void addFieldsToDatabase() 
	{
		ResultDatabase resultDatabase=new ResultDatabase(this);
		SQLiteDatabase insertResultDatabase=resultDatabase.getReadableDatabase();
		
		ContentValues values=new ContentValues();
		
		//put data name into database
		values.put(USER_ID, userId);
		values.put(USER_RESPONSE, userResponse);
		values.put(CORRECT_RESPONSE, correctResponse);
		values.put(QUESTION_CATEGORY, questionCategory);
		
		if(responseCorrectness)
			values.put(RESPONSE_CORRECTNESS, 1);
		else
			values.put(RESPONSE_CORRECTNESS, 0);
		
		values.put(TEST_DATE, testDate);
		
		values.put(ENTRY_TIME, entryTime);
		values.put(END_TIME, endTime);
		values.put(DUTATION_ACCUMULATED, durationAccumulated);
		
		// set initialized value 
		initialized=1;
		// set responded value
		responded=1;
		// set session state value
		sessionStatus="final";
		// set num attempts value
		numAttempts="1";
		// set completion status value
		completionStatus="Unknown";
		// set response value
		response=userResponse;
		// set score value
		if(userResponse.equals(correctResponse))
			score="single float::" + 1.0;
		else 
			score="single float::" + 0.0;
		
		values.put(INITIALIZED, initialized);
		values.put(RESPONDED, responded);
		values.put(SESSION_STATUS, sessionStatus);
		values.put(NUM_ATTEMPTS, numAttempts);
		values.put(COMPLETION_STATUS, completionStatus);
		values.put(SCORE, score);
		values.put(RESPONSE, response);
		
		insertResultDatabase.insertOrThrow(TABLE_NAME, null, values);

		insertResultDatabase.close();
	}
	
	private String getTestTakenDateAndEndTime() 
	{
		Calendar calendar=Calendar.getInstance();
		
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		int month=calendar.get(Calendar.MONTH);
		int year=calendar.get(Calendar.YEAR);
		
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		int minute=calendar.get(Calendar.MINUTE);
		int seconds=calendar.get(Calendar.SECOND);
		
		endTime=year+"/"+month+"/"+day+" "+hour+":"+minute+":"+seconds;
		
		// calculate duration accumulated
		calculateTimeDifference(calendar);
		
		return day+"/"+month+"/"+year+" "+hour+":"+minute+":"+seconds;
	}

	/**
	 * Calculate duration accumulated time in seconds
	 */
	private void calculateTimeDifference(Calendar endTimeQuestionCal) 
	{
		long startQuestionTime=startTimeQuestionCal.getTimeInMillis();
		
		long endQuestionTime=endTimeQuestionCal.getTimeInMillis();
		
		long durationAccumulated= endQuestionTime - startQuestionTime;
		
		durationAccumulated=durationAccumulated/1000;
		
		this.durationAccumulated=durationAccumulated + "";
	}

	public void createChoiceList(List<String> choicesList) {
		RadioGroup choiceGroup = (RadioGroup) findViewById(R.id.radioChoice);
		RadioGroup.LayoutParams para = new RadioGroup.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		((RadioGroup.LayoutParams) para).setMargins(5, 2, 5, 2);
		
		
		for (String choices : choicesList) {
			RadioButton rbChoice = new RadioButton(this);
			rbChoice.setTextSize(15);
			rbChoice.setText(" \t" + choices);
			rbChoice.setLayoutParams(para);
			rbChoice.setId(radioButtonIdCounter);
			choiceGroup.addView(rbChoice);
			radioButtonIdCounter++;
		}
	}

	public void createInlineChoiceList(List<String> choicesList)
	{
		inlineChoiceSpinner= (Spinner) findViewById(R.id.inlineChoice);
		
		TextView afterQuestionTextView = (TextView)findViewById(R.id.afterQuestionText);
		
		RadioGroup choiceGroup = (RadioGroup) findViewById(R.id.radioChoice);
		// make RadioGroup invisible
		choiceGroup.setVisibility(View.GONE);
		
		// make spinner visible
		inlineChoiceSpinner.setVisibility(View.VISIBLE);
		// make after question text view visible
		afterQuestionTextView=(TextView)findViewById(R.id.afterQuestionText);
		afterQuestionTextView.setVisibility(View.VISIBLE);
		
		afterQuestionTextView.setText(afterQuestionText.trim());
		
		inlineChoiceSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner_item, choicesList));
		
		
		
	}
	
	public void createMultiChoiceList(List<String> choicesList) {
		RadioGroup choiceGroup = (RadioGroup) findViewById(R.id.radioChoice);
		RadioGroup.LayoutParams para = new RadioGroup.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		((RadioGroup.LayoutParams) para).setMargins(5, 2, 5, 2);
		for (String choices : choicesList) {
			CheckBox rbChoice = new CheckBox(this);
			rbChoice.setTextSize(15);
			rbChoice.setText(" \t" + choices);
			rbChoice.setLayoutParams(para);
			choiceGroup.addView(rbChoice);
		}
	}

	public void showChoices(String chType, List<String> choicesList) {
		if (chType.equals("choiceMultiple")) {
			createMultiChoiceList(choicesList);
		} else if(chType.equals("choice")){
			createChoiceList(choicesList);
		} else if(chType.equals("hint")){
			createChoiceList(choicesList);
		} else if(chType.equals("inlineChoice")){
			createInlineChoiceList(choicesList);
		} else if(chType.equals("questionnaire")){
			createChoiceList(choicesList);
		} else if(chType.equals("math")){
			createChoiceList(choicesList);
		} else if(chType.equals("SVG")){
			createChoiceList(choicesList);
		}
			
		
	}

	public void checkResponce() {

	}
}
