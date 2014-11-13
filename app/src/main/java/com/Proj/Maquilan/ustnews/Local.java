package com.Proj.Maquilan.ustnews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class Local extends Activity implements View.OnClickListener {

    Button Button3;
    Button Button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        Button3 = (Button)findViewById(R.id.LocN_btn);
        Button3.setOnClickListener(this);
        Button4 = (Button)findViewById(R.id.LocE_btn);
        Button4.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.local, menu);
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

    private void button3Click()
    {
        startActivity(new Intent("android.intent.action.NEWS_ENGINEERING"));
    }

    private void button4Click()
    {
        startActivity(new Intent("android.intent.action.EVENTS_ENGINEERING"));
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.LocN_btn:
            {
                button3Click();
                break;
            }
            case R.id.LocE_btn:
            {
                button4Click();
                break;
            }
        }
    }
}
