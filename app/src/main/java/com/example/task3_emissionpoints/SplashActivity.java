package com.example.task3_emissionpoints;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

Handler h=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

h.postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent i=new Intent(SplashActivity.this,ProfileActivity.class);
        startActivity(i);
        finish();
    }
},1500);



    }
}