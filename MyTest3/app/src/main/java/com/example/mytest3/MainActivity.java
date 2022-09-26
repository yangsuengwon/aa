package com.example.mytest3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btSubActivity1,btSubActivity2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSubActivity1=findViewById(R.id.btn_SubActivity1);
        btSubActivity2=findViewById(R.id.btn_SubActivity2);
        btSubActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_SHORT).show();
                Intent mIntent=new Intent(MainActivity.this,SubActivity_1.class);
                startActivity(mIntent);
            }
        });
        btSubActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntnet=new Intent(MainActivity.this,SubActivity_2.class);
                startActivity(mIntnet);
            }
        });
    }
}