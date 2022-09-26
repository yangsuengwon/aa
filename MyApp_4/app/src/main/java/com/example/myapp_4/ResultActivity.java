package com.example.myapp_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    Button GoMain_4;
    TextView MainName,MainBirth;
    ImageView imgMain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        GoMain_4 = findViewById(R.id.bt_GoMain4);
        MainName = findViewById(R.id.tv_MainName);
        MainBirth = findViewById(R.id.tv_MainBirth);
        imgMain = findViewById(R.id.Imgview_MainImg);

        Intent mIntent=getIntent();
        String birth=mIntent.getStringExtra("name");
        String name=mIntent.getStringExtra("birth");
        int n=mIntent.getIntExtra("chk",0);
        MainName.setText(name);
        MainBirth.setText(birth);
        if(n==1){
            imgMain.setVisibility(View.VISIBLE);
        }
        else{
            imgMain.setVisibility(View.GONE);
        }
        GoMain_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    }