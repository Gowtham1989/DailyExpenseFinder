package com.dailyexpensefinder.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import com.dailyexpensefinder.R;
import com.dailyexpensefinder.util.Constants;

public class MainActivity extends AppCompatActivity {


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread background = new Thread() {
            public void run() {
                try {
                    Log.d(String.valueOf(getApplicationContext().getClass()),"In mainactivity");
                    sleep(Constants.SPLASH_TIME *1000);
                    Intent i=new Intent(MainActivity.this,StoreExpenses.class);
                    startActivity(i);
                } catch (Exception e) {

                }
            }
        };
        background.start();
    }
}
