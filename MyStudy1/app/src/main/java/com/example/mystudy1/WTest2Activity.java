package com.example.mystudy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class WTest2Activity extends AppCompatActivity {

    Button btTest,btCalcu;
    EditText etTest,etCheck,etNum1,etNum2;
    TextView tvTest,tvResult;
    RadioButton rbMultiply,rbMinus,rbDivision;
    Random random=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest2);

        btTest=findViewById(R.id.bt_Test);
        etTest=findViewById(R.id.et_Test);
        tvTest=findViewById(R.id.tv_test);
        etCheck=findViewById(R.id.et_Check);
        btCalcu=findViewById(R.id.bt_Calcu);
        etNum1=findViewById(R.id.et_Num1);
        etNum2=findViewById(R.id.et_Num2);
        tvResult=findViewById(R.id.tv_Result);
        rbDivision=findViewById(R.id.rb_Division);
        rbMinus=findViewById(R.id.rb_Minus);
        rbMultiply=findViewById(R.id.rb_Multiply);

        String sTemp=tvTest.getText().toString();
        etTest.setText(sTemp);

        btTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sText=etTest.getText().toString();
                String sCheck=etCheck.getText().toString();
                if(sText.equals(sCheck)){
                    Toast.makeText(getApplicationContext(),"Equal", Toast.LENGTH_SHORT).show();
                    tvTest.setText("Equal");

                }
                else{
                    Toast.makeText(getApplicationContext(),"Not", Toast.LENGTH_SHORT).show();
                    tvTest.setText("Not");
                }

            }
        });
        btCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sNum1,sNum2;
                int nNum1,nNum2;
                Integer nResult=0;;
                sNum1=etNum1.getText().toString();
                sNum2=etNum2.getText().toString();
                nNum1=Integer.parseInt(sNum1);
                nNum2=Integer.parseInt(sNum2);
                if(rbMinus.isChecked()){ ;
                    nResult=nNum1-nNum2;
                }
                else if(rbMultiply.isChecked()){
                    nResult=nNum1*nNum2;
                }
                else if(rbDivision.isChecked()){
                        nResult=nNum1/nNum2;
                    }
                else{
                    nResult=nNum1+nNum2;
                }
                tvResult.setText("Result : "+nResult.toString());

            }
        });

    }
}