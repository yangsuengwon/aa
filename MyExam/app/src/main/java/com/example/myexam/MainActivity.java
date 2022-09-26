package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btTest1,btTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTest1=findViewById(R.id.bt_Test1);
        btTest2=findViewById(R.id.bt_Test2);

        btTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(MainActivity.this,Test1.class);
                startActivity(mIntent);
            }
        });
        btTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(MainActivity.this,Test2Activity.class);
                startActivity(mIntent);
            }
        });

    }
}