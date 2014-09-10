package com.Proj.Maquilan.ustnews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Main extends Activity implements View.OnClickListener
{

    Button Button1;
    Button Button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button1 = (Button)findViewById(R.id.loc_btn);
        Button1.setOnClickListener(this);
        Button2 = (Button)findViewById(R.id.Uni_btn);
        Button2.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    private void button1Click()
    {
        startActivity(new Intent("android.intent.action.LOCAL"));
    }

    private void button2Click()
    {
        startActivity(new Intent("android.intent.action.UNIVERSITY"));
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.loc_btn:
            {
                button1Click();
                break;
            }
            case R.id.Uni_btn:
            {
                button2Click();
                break;
            }
        }
    }
}
