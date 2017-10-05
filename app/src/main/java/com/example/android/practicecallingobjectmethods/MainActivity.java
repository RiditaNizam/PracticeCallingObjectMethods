package com.example.android.practicecallingobjectmethods;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //Tells Android to restore previous values

        TextView textView = new TextView(this);  //this is this activity

        textView.setText("The quick brown fox jumps over the lazy dog!");

        textView.setTextSize(56);

        textView.setTextColor(Color.GREEN);

        textView.setMaxLines(2);  //Limits number of lines textview shoes to 2 lines

        setContentView(textView);  //Puts stuff on the activity screen
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);  //Puts items (and perhaps sub-items in app's menu)
        return true;  //Tells Android to display your app's menu
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();  //Grabs the code number of whatever item the user tapped

        if (id == R.id.action_settings) {  //Checks to find out if the user tapped this item
            return true;  //Tells Android tapping of menu item has been handled
        }

        return super.onOptionsItemSelected(item);  //Do whatever Android normally does for any old menu item tap
    }

}