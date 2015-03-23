package org.imsglobal.main;

import java.io.File;  
import java.util.List;  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;  

import org.imsglobal.xsd.imsqti_v2p1.AssessmentItem;
import org.imsglobal.xsd.imsqti_v2p1.OrderInteraction;

public class XmlToObject {  
    public static void main(String[] args) {  
   
     try {  

   	 JAXBContext jaxbContext = JAXBContext.newInstance(AssessmentItem.class);
    	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    	    AssessmentItem assesmentMap = (AssessmentItem) jaxbUnmarshaller.unmarshal( new File("assets/questions/choice_fixed.xml") );
    	    
        System.out.println("======="+assesmentMap.getIdentifier());  
        System.out.println("======="+assesmentMap.getTitle()); 
        System.out.println("======="+assesmentMap.getResponseDeclarations().get(0).getCorrectResponse().getValues().size());  
        System.out.println("======="+assesmentMap.getResponseDeclarations().get(0).getCorrectResponse().getValues().get(0).getValue());
        System.out.println("END"); 
    
      } catch (JAXBException e) {  
        e.printStackTrace();  
      }  
   
    }  
}  