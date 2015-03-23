package com.qa.render.utils;

import android.util.Patterns;

public class Utility {
	private Utility() {

	}

	public static boolean isEmailValid(String email) {
		return Patterns.EMAIL_ADDRESS.matcher(email).matches();
	}
}
