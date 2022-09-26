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

public class Test2Activity extends AppCompatActivity {

    Button btok2,btreset2;
    EditText etphone,etnote;
    RadioButton rbcard,rbcash,rbaccount;
    CheckBox chkphone,chknote,chkcal2;
    TextView tvaccount,tvphone,tvnote,tvpay,tvmoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        btok2=findViewById(R.id.bt_ok2);
        btreset2=findViewById(R.id.bt_reset2);
        etnote=findViewById(R.id.et_note);
        etphone=findViewById(R.id.et_phone);
        rbcard=findViewById(R.id.rb_card);
        rbaccount=findViewById(R.id.rb_account);
        rbcash=findViewById(R.id.rb_cash);
        chkcal2=findViewById(R.id.chk_cal2);
        chknote=findViewById(R.id.chk_note);
        chkphone=findViewById(R.id.chk_phone);
        tvaccount=findViewById(R.id.tv_account);
        tvmoney=findViewById(R.id.tv_money);
        tvnote=findViewById(R.id.tv_note);
        tvpay=findViewById(R.id.tv_pay);
        tvphone=findViewById(R.id.tv_phone);



        btok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkphone.isChecked()){
                    String phone=etphone.getText().toString();
                    tvphone.setText("핸드폰: "+phone+"개");
                }
                if(chknote.isChecked()){
                    String note=etnote.getText().toString();
                    tvnote.setText("노트북: "+note+"개");
                }
                if(rbaccount.isChecked()) {
                    tvpay.setText("결제 방법: 계좌이체");
                    tvaccount.setVisibility(View.VISIBLE);
                }
                if (rbcard.isChecked()){
                    tvpay.setText("결제 방법: 카드");
                    tvaccount.setVisibility(View.INVISIBLE);
                }
                if(rbcash.isChecked()){
                    tvpay.setText("결제 방법: 현금");
                    tvaccount.setVisibility(View.INVISIBLE);
                }
            }
        });
        chkcal2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String note=etnote.getText().toString();
                String phone=etphone.getText().toString();

                if (chkcal2.isChecked()){
                    int cal=(Integer.parseInt(phone)*2000)+(Integer.parseInt(note)*3000);
                    tvmoney.setText("결제 금액: "+Integer.toString(cal)+"원");
                }
                else{
                    tvmoney.setText("결제 금액: 0원");
                }
            }
        });
        btreset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chknote.setChecked(false);
                chkphone.setChecked(false);
                etnote.setText("노트북 수량 입력");
                etphone.setText("핸드폰 수량 입력");
                rbcard.setChecked(true);
                tvaccount.setVisibility(View.INVISIBLE);
                tvphone.setText("핸드폰 :     개");
                tvnote.setText("노트북 :     개");
                tvpay.setText("결제 방법:");
                tvmoney.setText("결제 금액:     원");
                chkcal2.setChecked(false);
            }
        });
    }
}