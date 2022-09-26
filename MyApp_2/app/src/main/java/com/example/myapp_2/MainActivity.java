package com.example.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edinput1, edinput2;
    Button btP,btM,btMUL,btD;
    TextView tvr;
    String sInput1,sInput2,sResult;
    int nResult;
    double nResult_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edinput1=findViewById(R.id.ed_input1);
        edinput2=findViewById(R.id.ed_input2);
        btP=findViewById(R.id.bt_plus);
        btM=findViewById(R.id.bt_minus);
        btMUL=findViewById(R.id.bt_multiply);
        btD=findViewById(R.id.bt_division);
        tvr =findViewById(R.id.tv_result);

       btP.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View v, MotionEvent event) {
               sInput1=edinput1.getText().toString();
               sInput2=edinput2.getText().toString();
               nResult=Integer.parseInt(sResult)+Integer.parseInt(sInput2);
               sResult=Integer.toString(nResult);
               tvr.setText(sResult);
               return false;
           }
       });


        btM.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                sInput1=edinput1.getText().toString();
                sInput2=edinput2.getText().toString();
                nResult=Integer.parseInt(sInput1)-Integer.parseInt(sInput2);
                tvr.setText(Integer.toString(nResult));
                return false;
            }
        });



        btMUL.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                sInput1=edinput1.getText().toString();
                sInput2=edinput2.getText().toString();
                nResult=Integer.parseInt(sInput1)*Integer.parseInt(sInput2);
                tvr.setText(Integer.toString(nResult));
                return false;
            }
        });


       btD.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View v, MotionEvent event) {
               sInput1=edinput1.getText().toString();
               sInput2=edinput2.getText().toString();
               if(sInput2.isEmpty()||sInput2.equals("0")){
                   tvr.setText("error");
               }
               else{
                   nResult=Integer.parseInt(sInput1)/Integer.parseInt(sInput2);
                   tvr.setText(Integer.toString(nResult));
               }
               return false;
           }
       });
    }


}