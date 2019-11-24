package com.example.bta.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bta.R;

public class SplashscreenActivity extends AppCompatActivity {
    int SPLASH_TIME = 1000; //This is 1 second

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        //Code to start timer and take action after the timer ends
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                Intent mySuperIntent = new Intent(SplashscreenActivity.this, MainActivity.class);
                startActivity(mySuperIntent);
                //This 'finish()' is for exiting the app when back button pressed from Home page which is ActivityHome
                finish();
            }
        }, SPLASH_TIME);
    }
}