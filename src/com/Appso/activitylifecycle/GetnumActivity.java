package com.Appso.activitylifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

public class GetnumActivity extends Activity {
	EditText phnEditText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_getnum);
		phnEditText = (EditText) findViewById(R.id.etPhonenum);
	}

	public void Submitphn(View v) {
		String number = phnEditText.getText().toString();
		Intent data = new Intent();
		data.putExtra("number", number);
		setResult(Activity.RESULT_OK, data);
		finish();
	}
}
