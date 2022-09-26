package com.example.myapp_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btSub1;
    Button btSub2;
    Button btSub3;
    Button btResult;
    EditText et_Name,et_Mybirth;
    CheckBox Chkimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSub1=findViewById(R.id.bt_Sub1);
        btSub2=findViewById(R.id.bt_Sub2);
        btSub3=findViewById(R.id.btSub_3);
        btResult=findViewById(R.id.bt_Result);
        et_Name=findViewById(R.id.et_MyName);
        et_Mybirth=findViewById(R.id.et_MyBirth);
        Chkimg=findViewById(R.id.chk_Viewimg);



       btSub1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mIntent=new Intent(MainActivity.this,Sub1Activity.class);
               startActivity(mIntent);
           }
       });

        btSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent_2=new Intent(MainActivity.this,Sub2Activity.class);
                startActivity(mIntent_2);
            }
        });
        btSub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent_3=new Intent(MainActivity.this,Sub3Activity.class);
                startActivity(mIntent_3);
            }
        });
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(MainActivity.this,ResultActivity.class);
                String name=et_Name.getText().toString();
                String birth=et_Mybirth.getText().toString();
                int chk;
                if(Chkimg.isChecked()){
                    chk=1;
                }
                else{
                    chk=0;
                }
                mIntent.putExtra("name",name);
                mIntent.putExtra("birth",birth);
                mIntent.putExtra("chk",chk);
                startActivity(mIntent);
            }
        });

    }
}