package com.qa.render;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qa.result_list.ResultListActivity;
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;


public class MainActivity extends Activity implements OnClickListener{
	String[] files;
	private Button getDatabaseResultsButton;
	private static int questTypeNum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   
        
        getDatabaseResultsButton=(Button)findViewById(R.id.getDatabaseResultsButton);
        
        AssetManager assetManager=getAssets();
        
        try {             
                files=assetManager.list("questions");             
            for(String name:files){  
            	addQuesType(name.substring(0, name.lastIndexOf(".")));
            }         	
           
             
        } catch (Exception e) {
            // TODO: handle exception
             
            e.printStackTrace();
        }
        
        getDatabaseResultsButton.setOnClickListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
  
    
    public void getQuestion(int quesTypeNum) {
    	HandleXML ques=new HandleXML();
    	ques.setFinalUrl("questions/"+files[quesTypeNum]);
        Intent intent = new Intent(this, QuestionActivity.class);       
        startActivity(intent);
    }
    
    public void addQuesType(String quesType){ 
    	
    	LinearLayout layout=(LinearLayout)findViewById(R.id.container);
    	LinearLayout.LayoutParams para=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
    	((LinearLayout.LayoutParams) para).setMargins(5, 2, 5, 2);
    	TextView text=new TextView(this);
    	text.setId(questTypeNum++);
    	text.setBackgroundResource(R.drawable.txt_bg);
    	text.setTextSize(25);
    	text.setText(" \t"+quesType);
    	text.setLayoutParams(para);
    	text.setOnClickListener(onclicklistener);
    	layout.addView(text);
    }
    
    OnClickListener onclicklistener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
        	final int viewId=v.getId();
        	getQuestion(viewId);
        }
    };
	@Override
	public void onClick(View v) 
	{
		Intent intent=new Intent(getApplicationContext(), ResultListActivity.class);
		startActivity(intent);
	}

}
