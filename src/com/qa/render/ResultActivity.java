package com.qa.render;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 
 * This class is to show results of the user response in Questions Activity
 *
 */
public class ResultActivity extends Activity
{
	private String userId;
	private String userResponse;
	private String correctResponse = "";
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
	
	private TextView userIdTV;
	private TextView userResponeTV;
	private TextView correctResponeTV;
	private TextView questionCategoryTV;
	private TextView responesCorrectnessTV;
	private TextView testDateTV;
	private TextView entryTimeTV;
	private TextView endTimeTV;
	private TextView durationAccumulatedTV;
	private TextView initializedTV;
	private TextView respondedTV;
	private TextView sessionStatusTV;
	private TextView numAttemptsTV;
	private TextView completionStatusTV;
	private TextView scoreTV;
	private TextView responseTV;
	
	private Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_after_question);
		
		intent=getIntent();
		
		formViewsById();
		
		getContentsFromIntent();
		
		setContentsFromIntentsObtained();
		
	}

	private void setContentsFromIntentsObtained()
	{
		userIdTV.setText(userId);
		userResponeTV.setText(userResponse);
		correctResponeTV.setText(correctResponse);
		questionCategoryTV.setText(questionCategory);
		responesCorrectnessTV.setText(responseCorrectness + "");
		testDateTV.setText(testDate);
		

		entryTimeTV.setText(entryTime);
		endTimeTV.setText(endTime);
		durationAccumulatedTV.setText(durationAccumulated + " seconds");
		if(initialized==1)
			initializedTV.setText(true + "");
		else
			initializedTV.setText(false + "");
		if(responded==1)
			respondedTV.setText(true + "");
		else
			respondedTV.setText(false + "");
		sessionStatusTV.setText(sessionStatus);
		numAttemptsTV.setText(numAttempts);
		completionStatusTV.setText(completionStatus);
		scoreTV.setText(score);
		responseTV.setText(response);
	}

	private void getContentsFromIntent() 
	{
		// get contents from the intent
		userId=intent.getStringExtra("userId");
		userResponse=intent.getStringExtra("userResponse");
		correctResponse=intent.getStringExtra("correctResponse");
		questionCategory=intent.getStringExtra("questionCategory");
		if(intent.getIntExtra("responseCorrectness", 0)==1)
			responseCorrectness=true;
		else if(intent.getIntExtra("responseCorrectness", 0)==0)
			responseCorrectness=false;
		testDate=intent.getStringExtra("testDate");
		
		entryTime=intent.getStringExtra("entryTime");
		endTime=intent.getStringExtra("endTime");
		durationAccumulated=intent.getStringExtra("durationAccumulated");
		initialized=intent.getIntExtra("initialized", 0);
		responded=intent.getIntExtra("responded", 0);
		sessionStatus=intent.getStringExtra("sessionStatus");
		numAttempts=intent.getStringExtra("numAttempts");
		completionStatus=intent.getStringExtra("completionStatus");
		score=intent.getStringExtra("score");
		response=intent.getStringExtra("response");
	}

	private void formViewsById() 
	{
		userIdTV=(TextView)findViewById(R.id.userId);
		userResponeTV=(TextView)findViewById(R.id.userResponse);
		correctResponeTV=(TextView)findViewById(R.id.userCorrectResponse);
		questionCategoryTV=(TextView)findViewById(R.id.questionCategory);
		responesCorrectnessTV=(TextView)findViewById(R.id.responseCorrectness);
		testDateTV=(TextView)findViewById(R.id.testDate);
		entryTimeTV=(TextView)findViewById(R.id.entryTime);
		endTimeTV=(TextView)findViewById(R.id.endTime);
		durationAccumulatedTV=(TextView)findViewById(R.id.durationAccumulated);
		initializedTV=(TextView)findViewById(R.id.initialized);
		respondedTV=(TextView)findViewById(R.id.responded);
		sessionStatusTV=(TextView)findViewById(R.id.sessionStatus);
		numAttemptsTV=(TextView)findViewById(R.id.numAttempts);
		completionStatusTV=(TextView)findViewById(R.id.completionStatus);
		scoreTV=(TextView)findViewById(R.id.score);
		responseTV=(TextView)findViewById(R.id.response);
	}
}
