package com.example.mathprojectavishaigozland;

import android.widget.Toast;

import java.util.Random;

public class Exercis {
    int mana1;
    int mana2;
    int result;


    //פעולה לכפתור הראשון - לוח הכפל
    public void multy(){
        Random random = new Random();
        mana1 = random.nextInt(10);
        mana2 = random.nextInt(10);
        result = mana1 * mana2;

        ma.TV_firstNum.setText(mana1+"");
        ma.TV_secondNum.setText(mana2+"");
    }

    //פעולה לכפתור שני - כפל עד 20
    public void multy20(){
        Random random = new Random();
        mana1 = random.nextInt(10);
        mana2 = random.nextInt(10)+10;
        result = mana1 * mana2;

        ma.TV_firstNum.setText(mana1+"");
        ma.TV_secondNum.setText(mana2+"");
    }

    //פעולה לכפתור שלישי - אתגר
    public void multyEtgar(){
        Random random = new Random();
        mana1 = random.nextInt(10);
        mana2 = random.nextInt(90)+10;
        result = mana1 * mana2;

        ma.TV_firstNum.setText(mana1+"");
        ma.TV_secondNum.setText(mana2+"");
    }

    //פעולת תשובה
    public void answearAfirst(){
        String answer = ET_answer.getText().toString();
        if(answer.equals(result+"")){
            Toast.makeText(MainActivity.this, "מעולה!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "נסה שוב", Toast.LENGTH_SHORT).show();
        }
    }
}
