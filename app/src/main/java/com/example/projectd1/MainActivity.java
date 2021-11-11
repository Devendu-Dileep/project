package com.example.projectd1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton radd,radr,rade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radd=findViewById(R.id.radDonor);
        radr=findViewById(R.id.radReceiver);
        rade=findViewById(R.id.radEmployee);
        radd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Donor_Login.class);
                startActivity(intent);
            }
        });
        radr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Receiver_Login.class);
                startActivity(intent);
            }
        });
        rade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Employee_Login.class);
                startActivity(intent);
            }
        });
    }
}