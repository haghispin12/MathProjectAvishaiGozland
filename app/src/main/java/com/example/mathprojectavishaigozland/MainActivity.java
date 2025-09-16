package com.example.mathprojectavishaigozland;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    private Button Btn_etgar;
    private Button Btn_up20;
    private Button Btn_kefel;
    private TextView TV_firstNum;
    private TextView TV_secondNum;
    private EditText ET_answer;
    private Button Btn_chek;
    private Button Btn_save;
    private Button Btn_allUsers;
    private int result;
    Exercis ex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        createClickListener();
        Exercis ex = new Exercis(this);
    }

    private void initViews() {
        TV_firstNum = findViewById(R.id.firstNum);
        TV_secondNum = findViewById(R.id.secondNum);
        ET_answer = findViewById(R.id.answer);
        Btn_etgar = findViewById(R.id.etgar);
        Btn_up20 = findViewById(R.id.up20);
        Btn_kefel = findViewById(R.id.kefel);
        Btn_chek = findViewById(R.id.chek);
        Btn_save = findViewById(R.id.save);
        Btn_allUsers = findViewById(R.id.allUsers);

    }

    private void createClickListener() {
        Btn_kefel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V){
                 ex.multy();
            }
        });
        Btn_up20.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ex.multy20();
            }
        }));
        Btn_etgar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ex.multyEtgar();
            }
        });
        Btn_chek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ex.answearAfirst();
            }
        });



    }


}


