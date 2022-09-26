package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Test1 extends AppCompatActivity {

    EditText etbirth,etpw,etpwchk;
    Button btok,btreset;
    RadioButton rbmale,rbfemale;
    CheckBox chkcal;
    TextView tvpw,tvbirth,tvage,tvgender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        etbirth=findViewById(R.id.et_birth);
        etpw=findViewById(R.id.et_pw);
        etpwchk=findViewById(R.id.et_pwchk);
        btok=findViewById(R.id.bt_ok);
        btreset=findViewById(R.id.bt_reset);
        rbfemale=findViewById(R.id.rb_female);
        rbmale=findViewById(R.id.rb_male);
        chkcal=findViewById(R.id.chk_cal);
        tvage=findViewById(R.id.tv_age);
        tvbirth=findViewById(R.id.tv_birth);
        tvgender=findViewById(R.id.tv_gender);
        tvpw=findViewById(R.id.tv_pw);

        btok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etpw.getText().toString().equals(etpwchk.getText().toString())){
                    tvpw.setText("비번: "+etpw.getText().toString());
                    String sBirth=etbirth.getText().toString();
                    String sYear=sBirth.substring(0,4);
                    String sMonth=sBirth.substring(4,6);
                    String sDay=sBirth.substring(6,8);
                    tvbirth.setText("생년월일: "+sYear+"년"+sMonth+"월"+sDay+"일");
                    if(rbmale.isChecked()){
                        tvgender.setText("성별: 남");
                    }
                    else if(rbfemale.isChecked()){
                        tvgender.setText("성별: 여");
                    }

                }
                else{
                    Toast.makeText(getApplicationContext(),"비번이 일치하지 않습니다.",Toast.LENGTH_SHORT).show();

                }



            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            etbirth.setText("");
            etpw.setText("");
            etpwchk.setText("");
            tvpw.setText("비번:");
            tvgender.setText("성별: 남/여");
            tvbirth.setText("생년월일:     년   월   일");
            tvage.setText("나이:   세");
            rbmale.setChecked(true);
            chkcal.setChecked(false);

            }
        });
        chkcal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkcal.isChecked()){
                    String year=etbirth.getText().toString();
                    int cal=2021-Integer.parseInt(year.substring(0,4));
                    String age=Integer.toString(cal);
                    tvage.setText("나이: "+age);

                }
                else{
                    tvage.setText("나이: ");
                }
            }
        });
    }





}