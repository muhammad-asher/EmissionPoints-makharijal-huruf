package com.example.task3_emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnPracticeActivity extends AppCompatActivity {

    Button btnback,btnHalqiyah,btnlahatiyah,btntarfiyah,btnshahjariyah,btnlisaveyah,btnniteyah,btnghunna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnpractice);

        btnback=(Button) findViewById(R.id.btnback);
        btnHalqiyah=(Button) findViewById(R.id.btnHalqiyah) ;
        btnlahatiyah=(Button) findViewById(R.id.btnLahatiyah) ;
        btntarfiyah=(Button) findViewById(R.id.btnTarfiyah) ;
        btnshahjariyah=(Button) findViewById(R.id.btnShajariyahHaafiyah) ;
        btnlisaveyah=(Button) findViewById(R.id.btnLisaveyah) ;
        btnniteyah=(Button) findViewById(R.id.btnNiteeyah) ;
        btnghunna=(Button) findViewById(R.id.btnGhunna) ;




        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LearnPracticeActivity.this
                        , MainAppActivity.class);
                startActivity(intent);
            }
        });

        btnHalqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LearnPracticeActivity.this
                        , HalqiyahActivity.class);
                startActivity(intent);
            }
        });
        btnlahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LearnPracticeActivity.this
                        , LahatiyahActivity.class);
                startActivity(intent);
            }
        });
        btntarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LearnPracticeActivity.this
                        , TarfiyahActivity.class);
                startActivity(intent);
            }
        });
        btnniteyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LearnPracticeActivity.this
                        , NiteeyahActivity.class);
                startActivity(intent);
            }
        });
        btnshahjariyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LearnPracticeActivity.this
                        , ShajariyahHaafiyahActivity.class);
                startActivity(intent);
            }
        });
        btnlisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LearnPracticeActivity.this
                        , LisaveyahActivity.class);
                startActivity(intent);
            }
        });
        btnghunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LearnPracticeActivity.this
                        , GhunnaActivity.class);
                startActivity(intent);
            }
        });
    }

}