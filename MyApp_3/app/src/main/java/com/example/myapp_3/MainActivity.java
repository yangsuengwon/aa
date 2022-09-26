package com.example.myapp_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt_Ok,btCancle;
    TextView tvResult;
    EditText edTtitle;
    CheckBox chkBeer, chkwine;
    RadioButton rdmale,rdfemale,rdyes,rdno;
    Switch  sw_door;
    ImageView imgView_beer,imgView_Wine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_Ok=findViewById(R.id.bt_Ok);
        btCancle=findViewById(R.id.btCancle);
        tvResult=findViewById(R.id.tvResult);
        edTtitle=findViewById(R.id.edTtitle);
        chkBeer=findViewById(R.id.chkBeer);
        chkwine=findViewById(R.id.chkwine);
        rdfemale=findViewById(R.id.rdfemale);
        rdmale=findViewById(R.id.rdmale);
        rdyes=findViewById(R.id.rdyes);
        rdno=findViewById(R.id.rdno);
        sw_door=findViewById(R.id.sw_door);
        imgView_beer=findViewById(R.id.imgView_beer);
        imgView_Wine=findViewById(R.id.img_wine);
        bt_Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edTtitle.getText().toString();
                tvResult.setText(a);
            }
        });
       btCancle.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               edTtitle.setText("");
               tvResult.setText("");
           }
       });

        chkBeer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkBeer.isChecked()){
                    imgView_beer.setVisibility(View.VISIBLE);
                }
                else{
                    imgView_beer.setVisibility(View.GONE);
                }
            }
        });
        chkwine.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkwine.isChecked()){
                    imgView_Wine.setVisibility(View.VISIBLE);
                }
                else{
                    imgView_Wine.setVisibility(View.GONE);
                }
            }
        });
       imgView_beer.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(rdfemale.isChecked()){
                   Toast.makeText(getApplicationContext(),"female",Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(getApplicationContext(),"male",Toast.LENGTH_SHORT).show();
               }
           }
       });
        imgView_Wine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(rdyes.isChecked()){
                   Toast.makeText(getApplicationContext(),"yes",Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(getApplicationContext(),"no",Toast.LENGTH_SHORT).show();
               }
            }
        });



    }
}