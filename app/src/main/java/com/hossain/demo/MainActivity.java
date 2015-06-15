package com.hossain.demo;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.EditText;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    private EditText edtOrigin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionbar();
        initialize();
    }



    private void initialize() {
        edtOrigin = (EditText) findViewById(R.id.edtOrginCity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //  getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
    @author hossain
     */

    private void actionbar() {
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(false);actionbar.setDisplayShowHomeEnabled(true);
        actionbar.setDisplayShowTitleEnabled(true);
        actionbar.setIcon(R.drawable.ic_drawer);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#123148")));
    }

}
