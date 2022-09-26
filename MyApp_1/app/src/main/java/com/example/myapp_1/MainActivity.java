package com.example.myapp_1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
  Button BtTest;
  EditText EdTitle;
  Button BtExit;
  Button BtInternet;
  Button BtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtTest=findViewById(R.id.Bt_Test);
        EdTitle=findViewById(R.id.Ed_Title);
        BtExit=findViewById(R.id.Bt_Exit);
        BtInternet=findViewById(R.id.Bt_Internet);
        BtPhone=findViewById(R.id.Bt_Phone);

        BtTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_SHORT).show();
            }
        });
        BtExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"종료합니다.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        BtInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://google.com"));
                startActivity(mIntent);
            }
        });
        BtPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/0108989"));
                startActivity(mIntent);
            }
        });
    }

}