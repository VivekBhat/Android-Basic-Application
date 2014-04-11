package com.example.myfirstapp;


import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	private static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		Intent intent=getIntent();
		String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView textView=new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);
		
		//setContentView(R.layout.activity_main);
		setContentView(textView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater=getMenuInflater();
		//inflater.inflate(R.menu.main_activity_actions, menu)
		
		return onCreateOptionsMenu(menu);
	}
	
	public void sendMessage(View view){
		
		Intent intent=new Intent(this, DisplayMessageActivity.class);
		//EditText editText=(EditText) findViewById(R.id.edit_message);
		//String message=editText.getText().toString();
		//intent.putExtra(EXTRA_MESSAGE, message);
		//startActivity(intent);
	}
	

}
