package com.example.task3_emissionpoints;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Random;

public class ExamActivity extends AppCompatActivity {
    String question,answer;
    int rand_num=0,count=0,right=0;
    String[][] QnA_Array={
            {"Halqiyah Sound Produced from End of Throat",       "أ ہ","غ خ","ق","ک"},
            {"Latiyah Sound Produced from Middle of Throat",    "أ ہ" ,"غ خ","ق","ع ح"},
            {"Tarfiyah Sound Produced from Rounded tip of the tongue touching the base of the frontal 6 teeth",    "أ ہ" ,"غ خع ح","None" ,"ن"},
            {"Haqiyah Sound Produced from Start of Throat",     "ق","ع ح","أ ہ","غ خ"},
            {"Lahatiyah Sound Produced from Base of Tongue which is near Uvula touching the mouth roof",       "أ ہ","غ خ","ق","ک"},
            {"Lahatiyah Sound Produced from Portion of Tongue near its base touching the roof of mouth",       "غ خ","ق","ع ح","ک"},
            {"Shajariyah-Haafiyah Sound Produced from Tongue touching the center of the mouth roof",       " خ","ج ش ی","عح","ک"},
            {"How many Makhārij (مخارج Emission) points are require to correctly read Quran?",       "21","22","24","17"},
            {"Tarfiyah Sound Produced from Rounded tip of the tongue touching the base of the frontal 8 teeth",  "ل","ج ی","ض","ک"},
            {"Tarfiyah Sound Produced from Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth", "ر","ج ی","ض","ک"},
            {"Nit-eeyah Sound Produced from Tip of the tongue touching the base of the front 2 teeth", "ر","ج ی","ت د ط","ت د "},
            {"Lisaveyah Sound Produced from Tip of the tongue comes between the front top and bottom teeth", "ظ  ث","ج ی","ص ز س","ت ص ز س"},

    };
    String[] A={
            "أ ہ","ع ح","ن","غ خ","ق","ک","ج ش ی","غ خ","ض","ل","ر","ت د ط","ظ  ذ  ث","ص ز س"
    };

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        randomQuestions();
        count++;
    }
    public void randomQuestions(){
        if(count<5) {
            Random rand = new Random();
            rand_num = rand.nextInt(13);
            TextView textView = findViewById(R.id.qid);
            textView.setText(QnA_Array[rand_num][0]);

            RadioButton op1btn = findViewById(R.id.op1);
            RadioButton op2btn = findViewById(R.id.op2);
            RadioButton op3btn = findViewById(R.id.op3);
            RadioButton op4btn = findViewById(R.id.op4);
            op1btn.setText(QnA_Array[rand_num][1]);
            op2btn.setText(QnA_Array[rand_num][2]);
            op3btn.setText(QnA_Array[rand_num][3]);
            op4btn.setText(QnA_Array[rand_num][4]);
        }else{
            finalScoreActivity();
        }
    }
    public void nextQuestion(View view){
        btn1Click(); btn2Click(); btn3Click(); btn4Click();
        randomQuestions();
        count++;
    }
    public void quitButton(View view){
        finalScoreActivity();
    }
    public void finalScoreActivity(){
        Intent intent = new Intent(ExamActivity.this, finalScore.class);
        intent.putExtra("count", count);
        intent.putExtra("right", right);
        startActivity(intent);
        finish();
    }

    RadioButton opbtn;
    String choice;
    public void btn1Click(){
        opbtn= findViewById(R.id.op1);
        opbtn.setTextColor(Color.BLACK);
            }
    public void btn2Click(){
        opbtn= findViewById(R.id.op2);
        opbtn.setTextColor(Color.BLACK);

    }
    public void btn3Click(){
        opbtn= findViewById(R.id.op3);
        opbtn.setTextColor(Color.BLACK);

    }
    public void btn4Click(){
        opbtn= findViewById(R.id.op4);
        opbtn.setTextColor(Color.BLACK);

    }
    void choiceColorChange(String choice){
        if(choice.equals(A[rand_num])) {
            opbtn.setTextColor(Color.GREEN);
            right++;
        }
        else{
            opbtn.setTextColor(Color.RED);
        }
    }

    public void onRadioButtonClicked(View view) {
        // button checked?
        boolean checked = ((RadioButton) view).isChecked();

        // which radio button clicked
        switch(view.getId()) {
            case R.id.op1:
                if (checked){
                    opbtn= findViewById(R.id.op1);
                    choice = opbtn.getText().toString();
                    choiceColorChange(choice);
                    btn2Click(); btn3Click(); btn4Click();
                }
                break;
            case R.id.op2:
                if (checked){
                    opbtn= findViewById(R.id.op2);
                    choice = opbtn.getText().toString();
                    choiceColorChange(choice);
                    btn1Click(); btn3Click(); btn4Click();
                }
                break;
            case R.id.op3:
                if (checked){
                    opbtn= findViewById(R.id.op3);
                    choice = opbtn.getText().toString();
                    choiceColorChange(choice);
                    btn2Click(); btn1Click(); btn4Click();
                }
                break;
            case R.id.op4:
                if (checked){
                    opbtn= findViewById(R.id.op4);
                    choice = opbtn.getText().toString();
                    choiceColorChange(choice);
                    btn2Click(); btn1Click(); btn3Click();
                }
                break;
        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.epmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.action_Refresh){
            finish();
            startActivity(getIntent());
        } else if(id==R.id.action_settings){
            Toast.makeText(this, "Setting clicked", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.action_notification){
            Toast.makeText(this, "Notification clicked", Toast.LENGTH_SHORT).show();
        } else if (id==R.id.action_exit){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}