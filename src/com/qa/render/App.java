package com.qa.render;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.preference.PreferenceManager;

public class App extends Application {

	public static App app;
	public static SharedPreferences appPrefs;

	@Override
	public void onCreate() {
		super.onCreate();
		app = this;
		appPrefs = PreferenceManager.getDefaultSharedPreferences(this);

	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
	}

	@Override
	public void onTerminate() {
		super.onTerminate();
	}

}