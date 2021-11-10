package com.example.task3_emissionpoints;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class QuizExamActivity extends AppCompatActivity implements View.OnClickListener
{

    Button btn_one, btn_two, btn_three, btn_four;
    TextView questionview;

    private Question question = new Question();

    private String answer;
    private int questionLength = question.questions.length;

    Random random;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_exam);

        random = new Random();


        btn_one = (Button)findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        btn_two = (Button)findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);
        btn_three = (Button)findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);
        btn_four = (Button)findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this);

        questionview = (TextView)findViewById(R.id.quizquestion);

        NextQuestion(random.nextInt(questionLength));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                if(btn_one.getText() == answer){
                    Toast.makeText(QuizExamActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    score++;
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    score--;
                    Incorrectoption();
                }

                break;

            case R.id.btn_two:
                if(btn_two.getText() == answer){
                    Toast.makeText(QuizExamActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    score++;
                    NextQuestion(random.nextInt(questionLength));

                }else{
                    score--;
                    Incorrectoption();
                }

                break;

            case R.id.btn_three:
                if(btn_three.getText() == answer){
                    Toast.makeText(QuizExamActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    score++;
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    score--;
                    Incorrectoption();
                }

                break;

            case R.id.btn_four:
                if(btn_four.getText() == answer){
                    Toast.makeText(QuizExamActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    score++;
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    score--;
                    Incorrectoption();

                }

                break;


        }

    }

    private void Incorrectoption(){
        Toast.makeText(QuizExamActivity.this, "You Are InCorrect", Toast.LENGTH_SHORT).show();
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizExamActivity.this);
        alertDialogBuilder
                .setMessage("You are Incorrect")
                .setCancelable(true)
                .setPositiveButton("Continue The Quiz", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), QuizExamActivity.class));
                        finish();

                    }
                })
                .setNegativeButton("Go to Main Screen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainAppActivity.class));
                    }
                });
        alertDialogBuilder.show();

    }

    private void NextQuestion(int num){
        questionview.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice1(num));
        btn_two.setText(question.getchoice2(num));
        btn_three.setText(question.getchoice3(num));
        btn_four.setText(question.getchoice4(num));

        answer = question.getCorrectAnswer(num);
    }

}