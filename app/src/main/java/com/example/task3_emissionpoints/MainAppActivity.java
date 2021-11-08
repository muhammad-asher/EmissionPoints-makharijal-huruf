package com.example.task3_emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainAppActivity extends AppCompatActivity {

    Button buttonPractice,buttonQuizExam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);


        buttonPractice=(Button) findViewById(R.id.btnPractice);
        buttonQuizExam=(Button) findViewById(R.id.btnExam) ;

        buttonPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainAppActivity.this, LearnPracticeActivity.class);
                startActivity(intent);
            }

        });
        buttonQuizExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainAppActivity.this, QuizExamActivity.class);
                startActivity(intent);
            }
        });

    }
}