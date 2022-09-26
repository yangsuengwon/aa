package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btWidgetTest2,btWidgetTest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btWidgetTest2=findViewById(R.id.bt_WidgetTest2);
        btWidgetTest3=findViewById(R.id.bt_WidgetTest3);

        btWidgetTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent=new Intent(MainActivity.this,WTest2Activity.class);
                startActivity(mIntent);

            }
        });
        btWidgetTest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent=new Intent(MainActivity.this,WTest3Activity.class);
                startActivity(mIntent);
            }
        });

    }
}