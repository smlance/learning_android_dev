package com.example.myandroid;

import android.app.Activity;
import android.os.Bundle;
import android.os.Build;
import android.content.Intent;
import android.annotation.SuppressLint;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class aeTestActivity extends Activity
{

  public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
/* "It's generally a good practice to define keys for intent extras using
   your app's package name as a prefix. This ensures they are unique, in 
   case your app interacts with other apps."
*/

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
    {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
    }

  public void sendMessage(View view) {
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    EditText editText = (EditText) findViewById(R.id.edit_message);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);

    startActivity(intent);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu items for use in the action bar
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.main_activity_actions, menu);
    return super.onCreateOptionsMenu(menu);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle presses on the action bar items
    switch (item.getItemId()) {
    case R.id.action_search:
//      openSearch();
      return true;
    case R.id.action_settings:
//      openSettings();
      return true;
    default:
      return super.onOptionsItemSelected(item);
    }
  }

}
