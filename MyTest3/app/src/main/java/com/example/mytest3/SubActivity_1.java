package com.example.mytest3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity_1 extends AppCompatActivity {

    Button btNextActivity1,btExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        btNextActivity1=findViewById(R.id.btn_NextActivity1);
        btExit=findViewById(R.id.btn_Exit);

        btNextActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(SubActivity_1.this,NextActivity.class);
                startActivity(mIntent);
            }
        });
        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}