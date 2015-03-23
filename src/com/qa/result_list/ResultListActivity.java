package com.qa.result_list;


import java.util.ArrayList;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import com.qa.database.ResultDatabase;
import com.qa.render.R;

/**
 * 
 * This class is to show results of the user response in Questions Activity
 *
 */
public class ResultListActivity extends Activity
{
	private ListView resultListView;
	
	// lists to store data after retrieval from Database
	private ArrayList<String> userIdList=new ArrayList<String>();
	private ArrayList<String> userResponseList=new ArrayList<String>();
	private ArrayList<String> correctResponseList=new ArrayList<String>();
	private ArrayList<String> questionCategoryList=new ArrayList<String>();
	private ArrayList<String> responseCorrectnessList=new ArrayList<String>();
	private ArrayList<String> testDateList=new ArrayList<String>();
	
	private ArrayList<String> entryTimeList=new ArrayList<String>();
	private ArrayList<String> endTimeList=new ArrayList<String>();
	private ArrayList<String> durationAccumulatedList=new ArrayList<String>();
	private ArrayList<String> initializedList=new ArrayList<String>();
	private ArrayList<String> respondedList=new ArrayList<String>();
	private ArrayList<String> sessionStatusList=new ArrayList<String>();
	private ArrayList<String> numAttemptsList=new ArrayList<String>();
	private ArrayList<String> completionStatusList=new ArrayList<String>();
	private ArrayList<String> scoreList=new ArrayList<String>();
	private ArrayList<String> responseList=new ArrayList<String>();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		
		formViewsById();
		
		getListsFromDatabase();
		
		// set adapter to the list
		resultListView.setAdapter(new ResultListAdapter(this, userIdList, userResponseList, 
																	correctResponseList, questionCategoryList, 
																				responseCorrectnessList, testDateList,
																					entryTimeList, endTimeList, durationAccumulatedList,
																						initializedList, respondedList, sessionStatusList,
																							numAttemptsList, completionStatusList, scoreList, responseList));
		
	}


	private void formViewsById() 
	{
		resultListView=(ListView)findViewById(R.id.listViewResultActivity);
	}
	private void getListsFromDatabase()
	{
		ResultDatabase resultDatabase=new ResultDatabase(this);
		SQLiteDatabase getFromResultDatabase=resultDatabase.getReadableDatabase();
		
		String query="select * from result_table;";
		Cursor cursor=getFromResultDatabase.rawQuery(query, null);
	
	
		if(cursor!=null && cursor.getCount()>0)
		{
			while(cursor.moveToNext())
			{
				userIdList.add(cursor.getString(1));
				userResponseList.add(cursor.getString(2));
				correctResponseList.add(cursor.getString(3));
				questionCategoryList.add(cursor.getString(4));
				responseCorrectnessList.add(cursor.getString(5));
				testDateList.add(cursor.getString(6));
				
				entryTimeList.add(cursor.getString(7));
				endTimeList.add(cursor.getString(8));
				durationAccumulatedList.add(cursor.getString(9));
				initializedList.add(cursor.getString(10));
				respondedList.add(cursor.getString(11));
				sessionStatusList.add(cursor.getString(12));
				numAttemptsList.add(cursor.getString(13));
				completionStatusList.add(cursor.getString(14));
				scoreList.add(cursor.getString(15));
				responseList.add(cursor.getString(16));
			}
		}
		getFromResultDatabase.close();
		
	}
}
