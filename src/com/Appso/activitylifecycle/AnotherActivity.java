package com.Appso.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import android.util.Log;

public class AnotherActivity extends Activity {
	private TextView outpuTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);
		outpuTextView.setText(getIntent().getStringExtra("numberNum"));
		 Log.d("AnotherActivity", "-------onCreate()--------");

	}
	 @Override
	 protected void onRestart() {
	 super.onRestart();
	 Log.d("AnotherActivity", "-------onRestart()--------");
	
	 }
	
	 @Override
	 protected void onStart() {
	 super.onStart();
	 Log.d("AnotherActivity", "-------onStart()--------");
	
	 }
	
	 @Override
	 protected void onResume() {
	 super.onResume();
	 Log.d("AnotherActivity", "-------onResume()--------");
	
	 }
	
	 @Override
	 protected void onPause() {
	 super.onPause();
	 Log.d("AnotherActivity", "-------onPause()--------");
	
	 }
	
	 @Override
	 protected void onStop() {
	 super.onStop();
	 Log.d("AnotherActivity", "-------onStop()--------");
	
	 }
	
	 @Override
	 protected void onDestroy() {
	 super.onDestroy();
	 Log.d("AnotherActivity", "-------onDestroy()--------");
	
	 }
}
