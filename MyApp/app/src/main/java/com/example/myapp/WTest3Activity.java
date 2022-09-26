package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class WTest3Activity extends AppCompatActivity {

    ImageView imgS, imgP, imgR;
    CheckBox chkRock, chkPaper, chkScissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest3);

        imgP = findViewById(R.id.img_P);
        imgR = findViewById(R.id.img_R);
        imgS = findViewById(R.id.img_S);
        chkPaper = findViewById(R.id.chk_Paper);
        chkRock = findViewById(R.id.chk_Rock);
        chkScissors = findViewById(R.id.chk_Scissors);

        chkScissors.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkScissors.isChecked()){
                    imgS.setVisibility(View.VISIBLE);
                }
                else{
                    imgS.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
