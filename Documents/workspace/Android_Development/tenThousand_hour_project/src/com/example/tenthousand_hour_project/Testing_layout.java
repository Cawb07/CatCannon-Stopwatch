package com.example.tenthousand_hour_project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Testing_layout extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_testing_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.testing_layout, menu);
		return true;
	}

}