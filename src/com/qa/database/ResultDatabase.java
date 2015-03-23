package com.qa.database;

import static com.qa.database.Constants.*;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class ResultDatabase extends SQLiteOpenHelper{


	public static int DATABASE_VERSION=1;


	public String childTableQuery="CREATE TABLE " + TABLE_NAME + "(" 
			+ _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
			+ USER_ID + " INTEGER NOT NULL, "
			+ USER_RESPONSE + " TEXT NOT NULL, "
			+ CORRECT_RESPONSE + " TEXT NOT NULL, "
			+ QUESTION_CATEGORY + " TEXT NOT NULL, "
			+ RESPONSE_CORRECTNESS + " INTEGER DEFAULT 0, "
			+ TEST_DATE + " TEXT NOT NULL, "
			+ ENTRY_TIME + " TEXT NOT NULL, "
			+ END_TIME + " TEXT NOT NULL, "
			+ DUTATION_ACCUMULATED + " TEXT NOT NULL, "
			+ INITIALIZED + " INTEGER NOT NULL, "
			+ RESPONDED + " INTEGER NOT NULL, "
			+ SESSION_STATUS + " TEXT NOT NULL, "
			+ NUM_ATTEMPTS + " INTEGER NOT NULL, "
			+ COMPLETION_STATUS + " TEXT NOT NULL, "
			+ SCORE + " INTEGER NOT NULL, "
			+ RESPONSE + " TEXT NOT NULL);";  



	public ResultDatabase(Context context) {
		super(context,  DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
		onCreate(db);

	}






	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(childTableQuery);
	}

}
