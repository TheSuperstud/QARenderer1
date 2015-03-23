package com.qa.render;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.qa.render.utils.AlertUtil;
import com.qa.render.utils.Constants;
import com.qa.render.utils.Utility;

public class RegisterActivity extends Activity implements OnClickListener {

	private EditText etFirstName;
	private EditText etLastName;
	private EditText etEmail;
	private EditText etUserName;
	private EditText etPass;
	private Spinner spinDomain;
	private Button btnRegister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		initUI();

	}

	private void initUI() {
		findViewById();
		setActionListener();
		setViewState();
	}

	private void findViewById() {

		etFirstName = (EditText) findViewById(R.id.etFirstName);
		etLastName = (EditText) findViewById(R.id.etLastName);
		etEmail = (EditText) findViewById(R.id.etEmail);
		etUserName = (EditText) findViewById(R.id.etUserName);
		etPass = (EditText) findViewById(R.id.etPass);
		spinDomain = (Spinner) findViewById(R.id.spinDomain);
		btnRegister = (Button) findViewById(R.id.btnRegister);

	}

	private void setActionListener() {

		btnRegister.setOnClickListener(this);
	}

	private void setViewState() {
		spinDomain.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, getResources()
						.getStringArray(R.array.domain)));
	}

	boolean isRegistrationValid() {
		boolean flag = true;
		if (!Utility.isEmailValid(etEmail.getText().toString())) {
			etEmail.setError("please enter valid email address!");
			flag = false;
		}
		if (TextUtils.isEmpty(etUserName.getText())) {
			etUserName.setError("please enter username!");
			flag = false;
		}
		if (TextUtils.isEmpty(etPass.getText())) {
			etPass.setError("please enter password!");
			flag = false;
		}

		return flag;
	}

	@Override
	public void onClick(View v) {
		if (v == btnRegister) {
			// Handle clicks for btnRegister
			if (isRegistrationValid()) {
				App.appPrefs
						.edit()
						.putString(Constants.FIRST_NAME,
								etFirstName.getText().toString())
						.putString(Constants.LAST_NAME,
								etLastName.getText().toString())
						.putString(Constants.EMAIL_ADDRESS,
								etEmail.getText().toString())
						.putString(Constants.USERNAME,
								etUserName.getText().toString())
						.putString(Constants.PASSWORD,
								etPass.getText().toString())
						.putString(Constants.DOMAIN,
								spinDomain.getSelectedItem().toString())
						.apply();

				AlertUtil
						.showAlert(
								RegisterActivity.this,
								"You are successfully registered. please Log in to continue.",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										finish();
									}
								});

			}
		}
	}
}
