package com.Appso.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText etphn;
	private static final int PHONE_NUMBER = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		etphn = (EditText) findViewById(R.id.etPhone);
		setContentView(R.layout.activity_main);
		Log.d("MainActivity", "-------onCreate()---------");
	}

	public void submit(View v) {
		String phone = etphn.getText().toString();
		Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
		intent.putExtra("numberNum", phone);
		startActivity(intent);
	}

	public void getNumber(View v) {
		Intent intent = new Intent(MainActivity.this, GetnumActivity.class);
		startActivityForResult(intent, PHONE_NUMBER);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == PHONE_NUMBER) {
			if (resultCode == Activity.RESULT_OK) {
				String number=data.getStringExtra("number");
				etphn.setText(number);
			} else {
				Log.e("MainAvtivity", "Get num Activity Canceled");
			}
		}
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("MainActivity", "-------onRestart()--------");

	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("MainActivity", "-------onStart()--------");

	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("MainActivity", "-------onResume()--------");

	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("MainActivity", "-------onPause()--------");

	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("MainActivity", "-------onStop()--------");

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("MainActivity", "-------onDestroy()--------");

	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
			Log.d("MainActivity", "New congiguration: ORIENTATION_LANDSCAPE");

		} else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
			Log.d("MainActivity", "New congiguration : ORIENTATION_PORTRAIT");

		}
	}
}
