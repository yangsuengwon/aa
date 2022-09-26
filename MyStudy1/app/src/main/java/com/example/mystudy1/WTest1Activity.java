package com.example.mystudy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class WTest1Activity extends AppCompatActivity {

    TextView tvNoUse;
    Button btOk,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest1);

        tvNoUse=findViewById(R.id.tv_NoUse);
        btOk=findViewById(R.id.btn_OK);
        bt3=findViewById(R.id.button3);
        Random r=new Random();
        int a=r.nextInt(2)+1;


        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bt3.setEnabled(true);
            }
        });



    }
}