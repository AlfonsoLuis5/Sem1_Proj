package com.Proj.Maquilan.ustnews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.Proj.Maquilan.ustnews.R;

public class University extends Activity implements View.OnClickListener {

    Button Button5;
    Button Button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        Button5 = (Button)findViewById(R.id.UniN_btn);
        Button5.setOnClickListener(this);
        Button6 = (Button)findViewById(R.id.UniE_btn);
        Button6.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.university, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void button5Click()
    {
        startActivity(new Intent("android.intent.action.NEWS_UNIVERSITY"));
    }

    private void button6Click()
    {
        startActivity(new Intent("android.intent.action.EVENTS_UNIVERSITY"));
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.UniN_btn:
            {
                button5Click();
                break;
            }
            case R.id.UniE_btn:
            {
                button6Click();
                break;
            }
        }
    }
}
