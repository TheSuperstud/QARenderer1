package com.qa.result_list;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.qa.render.R;
public class ResultListAdapter extends ArrayAdapter<String>
{
	private Context context;
	private ArrayList<String> userIdList=new ArrayList<String>();
	private ArrayList<String> userResponseList=new ArrayList<String>();
	private ArrayList<String> correctResponseList=new ArrayList<String>();
	private ArrayList<String> questionCategoryList=new ArrayList<String>();
	private ArrayList<String> responseCorrectnessList=new ArrayList<String>();
	private ArrayList<String> testDateList=new ArrayList<String>();;	
	private LayoutInflater inflater;
	
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
	
	public ResultListAdapter(Context context, ArrayList<String> userIdList, ArrayList<String> userResponseList, 
												ArrayList<String> correctResponseList, ArrayList<String> questionCategoryList,
												ArrayList<String> responseCorrectnessList, ArrayList<String> testDateList,
												ArrayList<String> entryTimeList, ArrayList<String> endTimeList,
												ArrayList<String> durationAccumulatedList, ArrayList<String> initializedList,
												ArrayList<String> respondedList, ArrayList<String> sessionStatusList,
												ArrayList<String> numAttemptsList, ArrayList<String> completionStatusList,
												ArrayList<String> scoreList, ArrayList<String> responseList) 
	{
		super(context, R.layout.activity_result, userIdList);
		this.context=context;
		this.userIdList=userIdList;
		this.userResponseList=userResponseList;
		this.correctResponseList=correctResponseList;
		this.questionCategoryList=questionCategoryList;
		this.responseCorrectnessList=responseCorrectnessList;
		this.testDateList=testDateList;
		
		this.entryTimeList=entryTimeList;
		this.endTimeList=endTimeList;
		this.durationAccumulatedList=durationAccumulatedList;
		this.initializedList=initializedList;
		this.respondedList=respondedList;
		this.sessionStatusList=sessionStatusList;
		this.numAttemptsList=numAttemptsList;
		this.completionStatusList=completionStatusList;
		this.scoreList=scoreList;
		this.responseList=responseList;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent)
	{
		View vi=convertView;
		ViewHolder viewHolder;
		
		if(vi==null)
		{
			inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			vi=inflater.inflate(R.layout.listitem_result_activity, parent, false);
			
			viewHolder=new ViewHolder();
			
			viewHolder.userId=(TextView)vi.findViewById(R.id.userId);
			viewHolder.userRespone=(TextView)vi.findViewById(R.id.userResponse);
			viewHolder.correctRespone=(TextView)vi.findViewById(R.id.userCorrectResponse);
			viewHolder.questionCategory=(TextView)vi.findViewById(R.id.questionCategory);
			viewHolder.responesCorrectness=(TextView)vi.findViewById(R.id.responseCorrectness);
			viewHolder.testDate=(TextView)vi.findViewById(R.id.testDate);
			
			viewHolder.entryTime=(TextView)vi.findViewById(R.id.entryTime);
			viewHolder.endTime=(TextView)vi.findViewById(R.id.endTime);
			viewHolder.durationAccumulated=(TextView)vi.findViewById(R.id.durationAccumulated);
			viewHolder.initialized=(TextView)vi.findViewById(R.id.initialized);
			viewHolder.responded=(TextView)vi.findViewById(R.id.responded);
			viewHolder.sessionStatus=(TextView)vi.findViewById(R.id.sessionStatus);
			viewHolder.numAttempts=(TextView)vi.findViewById(R.id.numAttempts);
			viewHolder.completionStatus=(TextView)vi.findViewById(R.id.completionStatus);
			viewHolder.score=(TextView)vi.findViewById(R.id.score);
			viewHolder.response=(TextView)vi.findViewById(R.id.response);
			
			vi.setTag(viewHolder);
			
			
		}
		else
		{
			viewHolder=(ViewHolder) vi.getTag();
		}
		
		// set text to the list items
		viewHolder.userId.setText(userIdList.get(position));
		viewHolder.userRespone.setText(userResponseList.get(position));
		viewHolder.correctRespone.setText(correctResponseList.get(position));
		viewHolder.questionCategory.setText(questionCategoryList.get(position));
		
		// check for values stored in database and display result accordingly
		if(responseCorrectnessList.get(position).equals("1"))
			viewHolder.responesCorrectness.setText("true");
		else if(responseCorrectnessList.get(position).equals("0"))
			viewHolder.responesCorrectness.setText("false");
		viewHolder.testDate.setText(testDateList.get(position));
		
		viewHolder.entryTime.setText(entryTimeList.get(position));
		viewHolder.endTime.setText(endTimeList.get(position));
		viewHolder.durationAccumulated.setText(durationAccumulatedList.get(position) + " seconds");
		
		// check for values stored in database and display result accordingly
		if(initializedList.get(position).equals("1"))
			viewHolder.initialized.setText(true + "");
		else
			viewHolder.initialized.setText(false + "");
		
		if(respondedList.get(position).equals("1"))
			viewHolder.responded.setText(true + "");
		else
			viewHolder.responded.setText(false + "");
		
		viewHolder.sessionStatus.setText(sessionStatusList.get(position));
		viewHolder.numAttempts.setText(numAttemptsList.get(position));
		viewHolder.completionStatus.setText(completionStatusList.get(position));
		viewHolder.score.setText(scoreList.get(position));
		viewHolder.response.setText(responseList.get(position));
	
		return vi;
	}
	
	public static class ViewHolder
	{
		TextView userId, userRespone, correctRespone, questionCategory, responesCorrectness, testDate, 
					entryTime, endTime, durationAccumulated, initialized, responded, sessionStatus, numAttempts, 
						completionStatus, score, response;
	}


	
}