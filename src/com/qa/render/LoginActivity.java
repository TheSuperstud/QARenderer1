package com.qa.render;

import com.qa.render.utils.AlertUtil;
import com.qa.render.utils.Constants;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;

public class LoginActivity extends Activity implements OnClickListener {

	private EditText etUserName;
	private EditText etPass;
	private CheckBox checkbox;
	private Button btnLogin;
	private Button btnSignup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initUI();

	}

	private void initUI() {
		findViewById();
		setActionListener();
		setViewState();
	}

	private void setActionListener() {

		btnLogin.setOnClickListener(this);
		btnSignup.setOnClickListener(this);
	}

	private void setViewState() {
		if (App.appPrefs.getBoolean(Constants.REMEMBER_ME, false)) {
			checkbox.setChecked(true);
			etUserName.setText(App.appPrefs.getString(Constants.USERNAME, ""));
			etPass.setText(App.appPrefs.getString(Constants.PASSWORD, ""));
		}
	}

	private void findViewById() {

		etUserName = (EditText) findViewById(R.id.etUserName);
		etPass = (EditText) findViewById(R.id.etPass);
		checkbox = (CheckBox) findViewById(R.id.checkbox);
		btnLogin = (Button) findViewById(R.id.btnLogin);
		btnSignup = (Button) findViewById(R.id.btnSignup);

	}

	boolean isLoginValid() {
		boolean flag = true;
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
		if (v == btnLogin) {
			// Handle clicks for btnLogin
			if (isLoginValid()) {
				if (App.appPrefs.getString(Constants.USERNAME, "").equals(
						etUserName.getText().toString())
						&& App.appPrefs.getString(Constants.PASSWORD, "")
								.equals(etPass.getText().toString())) {
					App.appPrefs
							.edit()
							.putBoolean(Constants.REMEMBER_ME,
									checkbox.isChecked()).apply();
					startActivity(new Intent(LoginActivity.this,
							MainActivity.class));
					finish();
				} else {
					AlertUtil.showAlert(LoginActivity.this,
							"username or password is incorrect.");
				}
			}
		} else if (v == btnSignup) {
			startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

		}
	}

}
