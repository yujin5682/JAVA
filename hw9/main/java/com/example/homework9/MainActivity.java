package com.example.homework9;

import android.icu.util.Output;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView output1;
    TextView output2;
    TextView output3;
    TextView output4;
    TextView output5;
    TextView output6;

    EditText totalPerson;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    void init() {
        output1 = findViewById(R.id.output1);
        output2 = findViewById(R.id.output2);
        output3 = findViewById(R.id.output3);
        output4 = findViewById(R.id.output4);
        output5 = findViewById(R.id.output5);
        output6 = findViewById(R.id.output6);

        totalPerson = findViewById(R.id.totalPerson);

        Button randomButton = findViewById(R.id.randomButton);
        randomButton.setOnClickListener(v -> {

            randomNumber();

        });

    }

    void randomNumber() {



        //랜덤 숫자를 담을 배열 생성
        int[] randomNums = new int[6];

        for (int i=0; i<randomNums.length; i++) {

            //랜덤 숫자 생성


                double num = Math.random();
                double num2 = Math.floor(num * 80 + 1);
                randomNums[i] = new Double(num2).intValue();




            }
            //배열에 있는 랜덤 숫자를 인덱스 값을 가져와 출력
            output1.setText(""+randomNums[0]);
            output2.setText(""+randomNums[1]);
            output3.setText(""+randomNums[2]);
            output4.setText(""+randomNums[3]);
            output5.setText(""+randomNums[4]);
            output6.setText(""+randomNums[5]);

        }

}