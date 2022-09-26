package com.example.mytest3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {
    Button btSubActivity1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        btSubActivity1=findViewById(R.id.btn_SubActivity1);
        btSubActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Test Ok",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}