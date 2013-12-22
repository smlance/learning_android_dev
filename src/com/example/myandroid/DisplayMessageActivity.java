package com.example.myandroid;

//import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Build;
import android.content.Intent;
import android.annotation.SuppressLint;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_display_message);

        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // Show the Up button in the action bar.
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

	Intent intent = getIntent();
	String message = intent.getStringExtra(aeTestActivity.EXTRA_MESSAGE);

	TextView textView = new TextView(this);
	textView.setTextSize(40);
	textView.setText(message);

	setContentView(textView);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
