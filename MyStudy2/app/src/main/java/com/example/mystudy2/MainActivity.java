package com.example.mystudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btminus,btrps,btreset;
    TextView tvscissors,tvpaper,tvrock,tvcomscissors,tvcomrock,tvcompaper,tvresult;
    CheckBox chkscissors,chkrock,chkpaper;
    int nUserL,nUserR,nComL,nComR,nUserF,nComF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btminus=findViewById(R.id.bt_minus);
        btrps=findViewById(R.id.bt_rps);
        tvcompaper=findViewById(R.id.tv_compaper);
        tvcomrock=findViewById(R.id.tv_comrock);
        tvcomscissors=findViewById(R.id.tv_comscissors);
        tvpaper=findViewById(R.id.tv_paper);
        tvresult=findViewById(R.id.tv_result);
        tvrock=findViewById(R.id.tv_rock);
        tvscissors=findViewById(R.id.tv_scissors);
        chkpaper=findViewById(R.id.chk_paper);
        chkrock=findViewById(R.id.chk_rock);
        chkscissors=findViewById(R.id.chk_scissors);
        btreset=findViewById(R.id.bt_reset);

        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ncount=0;
                if(chkscissors.isChecked())
                    ncount+=1;
                if(chkrock.isChecked())
                    ncount+=1;
                if(chkpaper.isChecked())
                    ncount+=1;
                if(ncount!=1){
                    Toast.makeText(getApplicationContext(),"체크는 한개만 가능합니다",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(chkscissors.isChecked()){
                    tvscissors.setVisibility(View.VISIBLE);
                        nUserF=1;
                }
                else{
                    tvscissors.setVisibility(View.INVISIBLE);
                    chkscissors.setEnabled(false);
                }
                if(chkrock.isChecked()){
                    tvrock.setVisibility(View.VISIBLE);
                    nUserF=2;
                    }
                else{
                    tvrock.setVisibility(View.INVISIBLE);
                    chkrock.setEnabled(false);
                }
                if(chkpaper.isChecked()){
                    nUserF=3;
                }

                else{
                    tvpaper.setVisibility(View.INVISIBLE);
                    chkpaper.setEnabled(false);
                }
                int nTemp=(int)(Math.random()*2)+1;
                if(nTemp==1){
                    nComF=nComL;
                }
                else{
                    nComF=nComR;
                }
                tvcomrock.setVisibility(View.INVISIBLE);
                tvcompaper.setVisibility(View.INVISIBLE);
                tvcomscissors.setVisibility(View.INVISIBLE);
                if(nComF==1){
                    tvcomscissors.setVisibility(View.VISIBLE);
                }
                else if(nComF==2){
                    tvcomrock.setVisibility(View.VISIBLE);
                }
                else {
                    tvcompaper.setVisibility(View.VISIBLE);
                }
                if(nUserF==1){
                    if(nComF==1){
                        tvresult.setText("결과:무승부");
                    }
                    else if(nComF==2){
                        tvresult.setText("결과:패배");
                    }
                    else{
                        tvresult.setText("결과:승리");
                    }
                }
                if(nUserF==2){
                    if(nComF==1){
                        tvresult.setText("결과:승리");
                    }
                    else if(nComF==2){
                        tvresult.setText("결과:무승부");
                    }
                    else{
                        tvresult.setText("결과:패배");
                    }
                }
                if(nUserF==3){
                    if(nComF==1){
                        tvresult.setText("결과:패배");
                    }
                    else if(nComF==2){
                        tvresult.setText("결과:승리");
                    }
                    else{
                        tvresult.setText("결과:무승부");
                    }
                }

            }
        });

        btrps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ncount=0;
                if(chkscissors.isChecked())
                    ncount+=1;
                if(chkrock.isChecked())
                    ncount+=1;
                if(chkpaper.isChecked())
                    ncount+=1;
                if(ncount!=2){
                    Toast.makeText(getApplicationContext(),"체크는 두개만 가능합니다",Toast.LENGTH_SHORT).show();
                    return;
                }
                nUserL=0;
                nUserR=0;
                if(chkscissors.isChecked()){
                    if(nUserL==0)
                        nUserL=1;
                    else{
                        nUserR=1;
                    }
                }
                else{
                    chkscissors.setEnabled(false);
                    tvscissors.setVisibility(View.INVISIBLE);
                }
                if(chkrock.isChecked()){
                    if(nUserL==0)
                        nUserL=2;
                    else{
                        nUserR=2;
                    }
                }
                else{
                    tvrock.setVisibility(View.INVISIBLE);
                    chkrock.setEnabled(false);
                }
                if(chkpaper.isChecked()){
                    if(nUserL==0)
                        nUserL=3;
                    else{
                        nUserR=3;
                    }
                }
                else{
                    tvpaper.setVisibility(View.INVISIBLE);
                    chkpaper.setEnabled(false);
                }

                tvcomrock.setVisibility(View.INVISIBLE);
                tvcompaper.setVisibility(View.INVISIBLE);
                tvcomscissors.setVisibility(View.INVISIBLE);
                nComR=0;
                nComL=0;
                nComL=(int)(Math.random()*3)+1;
                do{
                    nComR=(int)(Math.random()*3)+1;
                }while(nComL==nComR);
                if(nComL==1) {
                    tvcomscissors.setVisibility(View.VISIBLE);

                    if (nComR == 2) {
                        tvcomrock.setVisibility(View.VISIBLE);
                    }
                    else if (nComR == 3) {
                        tvcompaper.setVisibility(View.VISIBLE);
                    }

                }
                else{
                    tvcomscissors.setVisibility(View.INVISIBLE);
                }

                if(nComL==2) {
                    tvcomrock.setVisibility(View.VISIBLE);
                    if(nComR==1) {
                        tvcomscissors.setVisibility(View.VISIBLE);
                    }
                    else if (nComR == 3) {
                        tvcompaper.setVisibility(View.VISIBLE);
                    }
                }
                else{
                    tvcomrock.setVisibility(View.INVISIBLE);
                }

                if(nComL==3) {
                    tvcompaper.setVisibility(View.VISIBLE);
                    if (nComR == 1) {
                        tvcomscissors.setVisibility(View.VISIBLE);
                    }
                    else if (nComR == 2) {
                        tvcomrock.setVisibility(View.VISIBLE);
                    }
                }
                else{
                    tvcompaper.setVisibility(View.INVISIBLE);
                }






            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvcompaper.setVisibility(View.VISIBLE);
                tvcomscissors.setVisibility(View.VISIBLE);
                tvcomrock.setVisibility(View.VISIBLE);
                tvpaper.setVisibility(View.VISIBLE);
                tvrock.setVisibility(View.VISIBLE);
                tvscissors.setVisibility(View.VISIBLE);
                chkpaper.setEnabled(true);
                chkscissors.setEnabled(true);
                chkrock.setEnabled(true);
                chkscissors.setChecked(false);
                chkrock.setChecked(false);
                chkpaper.setChecked(false);
                tvresult.setText("결과:");

            }
        });
    }
}