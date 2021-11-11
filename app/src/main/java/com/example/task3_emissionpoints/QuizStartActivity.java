package com.example.task3_emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizStartActivity extends AppCompatActivity {


    Button btnQuizstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_start);

        btnQuizstart=(Button) findViewById(R.id.btnStartQuiz);

        btnQuizstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(QuizStartActivity.this, ExamActivity.class);
                startActivity(intent);
            }
        });
    }
}