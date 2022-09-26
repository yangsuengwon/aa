package com.example.myapp_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.w3c.dom.Text;

public class TestvpActivity extends AppCompatActivity {

    Button btRight,btLeft;
    ViewFlipper vpMyvp;
    CalendarView cvMyCal;
    TextView tvdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testvp);

        btLeft=findViewById(R.id.bt_Left);
        btRight=findViewById(R.id.bt_Right);
        vpMyvp=findViewById(R.id.vp_MyVp);
        cvMyCal=findViewById(R.id.calendarView);
        tvdate=findViewById(R.id.tv_date);

        btLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMyvp.showNext();
            }
        });
        btRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMyvp.showPrevious();
            }
        });
        cvMyCal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date=Integer.toString(year)+"."+Integer.toString(month+1)+"."+Integer.toString(dayOfMonth);
                tvdate.setText(date);
            }
        });

    }
}