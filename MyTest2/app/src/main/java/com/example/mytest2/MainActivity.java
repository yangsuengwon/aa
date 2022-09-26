package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btExit,btToast,btWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btExit=findViewById(R.id.btn_Exit);
        btWeb=findViewById(R.id.btn_Web);
        btToast=findViewById(R.id.btn_Toast);

        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.daelim.ac.kr/"));
                startActivity(mIntent);
            }
        });

        btToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_SHORT).show();
            }
        });


    }
}