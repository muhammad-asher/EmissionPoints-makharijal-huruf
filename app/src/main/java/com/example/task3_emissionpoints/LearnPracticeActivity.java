package com.example.task3_emissionpoints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LearnPracticeActivity extends AppCompatActivity {

    Button btnback,btnHalqiyah,btnlahatiyah,btntarfiyah,btnshahjariyah,btnlisaveyah,btnniteyah,btnghunna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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
/**    public void click(View v)
    {
        switch (v.getId())
        {
            case R.id.btnHalqiyah:
                Intent obj=new Intent(LearnPracticeActivity.this, LearnScreensActivity.class);
                obj.putExtra("value", "Halqiyah");
                obj.putExtra("value1","p1");
                startActivity(obj);
                break;

            case R.id.btnLahatiyah:
                Intent obj1=new Intent(LearnPracticeActivity.this, LearnScreensActivity.class);
                obj1.putExtra("value", "Lahatiyah");
                obj1.putExtra("value1","p2");
                startActivity(obj1);
                break;

            case R.id.btnShajariyahHaafiyah:
                Intent obj2=new Intent(LearnPracticeActivity.this, LearnScreensActivity.class);
                obj2.putExtra("value", "Shajariyah-Haafiyah");
                obj2.putExtra("value1","p3");
                startActivity(obj2);
                break;

            case R.id.btnTarfiyah:
                Intent obj3=new Intent(LearnPracticeActivity.this, LearnScreensActivity.class);
                obj3.putExtra("value", "Tarfiyah");
                obj3.putExtra("value1","p4");
                startActivity(obj3);
                break;

            case R.id.btnNiteeyah:
                Intent obj4=new Intent(LearnPracticeActivity.this, LearnScreensActivity.class);
                obj4.putExtra("value", "Nit-eeyah");
                obj4.putExtra("value1","p5");
                startActivity(obj4);
                break;
*/
}