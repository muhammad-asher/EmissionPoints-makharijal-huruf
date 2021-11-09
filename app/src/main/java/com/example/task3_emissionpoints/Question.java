package com.example.task3_emissionpoints;

public class Question {
    public String questions[] = {
            "How many Makhārij (مخارج Emission) points are require to correctly read Quran?",
            "How many alphabets are in Arabic?",
            "Which is a small diagonal line placed above a letter?",
            "جہاں کہیں مخراج ادا کیا جاتا ہے، وہ جگا ___________ کہلائی جاتی ہے؟",
            "ق کی اداگی کے لیے زبان کی جار کو ٹالو کے _______ ہسائے فی لگاتے ہیں۔"
    };

    public String choices[][] = {
            {"21", "19", "17", "25"},
            {"29", "30", "35", "56"},
            {"فَتْحَة", "ضَمَّة", "كَسْرَة", "كَسْة"},
            {"مخراج","ترتیل","تجوید","حروف"},
            {"نرم طرف","مشکل حصے پر","سب سے آگے","کہیں نہیں لگتے"}
    };

    public String correctAnswer[] = {
            "17",
            "29",
            "فَتْحَة",
            "مخراج",
            "نرم طرف",
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
