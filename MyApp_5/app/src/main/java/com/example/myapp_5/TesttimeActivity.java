package com.example.myapp_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TesttimeActivity extends AppCompatActivity {

    Button btTimeMain,btTime;
    TimePicker tpTime;
    TextView tvTime;
    int nSelH,nSelM,tvView;
    String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testtime);

        btTimeMain=findViewById(R.id.bt_TimeMain);
        tpTime=findViewById(R.id.tp_Time);
        btTime=findViewById(R.id.bt_Time);
        tvTime=findViewById(R.id.tv_Time);


        tpTime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                time=Integer.toString(hourOfDay)+":"+Integer.toString(minute);
                tvTime.setText(time);
            }
        });

        btTimeMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(TesttimeActivity.this,MainActivity.class);
                mIntent.putExtra("time",time);
                mIntent.putExtra("chk",1);
                startActivity(mIntent);
            }
        });
        btTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nSelH=tpTime.getCurrentHour();
                nSelM=tpTime.getCurrentMinute();

                tvTime.setText(Integer.toString(nSelH)+":"+Integer.toString(nSelM));
            }
        });
    }
}