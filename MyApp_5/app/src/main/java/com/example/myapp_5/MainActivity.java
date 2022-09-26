package com.example.myapp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btTimeAct,btVPTest;
    TextView tvReturnTime;
    int Visible;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTimeAct=findViewById(R.id.bt_TimeAct);
        tvReturnTime=findViewById(R.id.tv_ReturnTime);
        btVPTest=findViewById(R.id.bt_vpTest);


        btTimeAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(MainActivity.this,TesttimeActivity.class);
                startActivity(mIntent);
            }
        });
        Intent mIntent=getIntent();
        String time=mIntent.getStringExtra("time");
        int chk=mIntent.getIntExtra("chk",0);
        if(chk==1){
            tvReturnTime.setVisibility(View.VISIBLE);
        }
        else{
            tvReturnTime.setVisibility(View.GONE);
        }
        btVPTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(MainActivity.this,TestvpActivity.class);
                startActivity(mIntent);
            }
        });
    }
}