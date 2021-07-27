package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        String r_emi = getIntent().getStringExtra("Emi");
        String r_ti = getIntent().getStringExtra("Ti");


        Runnable rnew = new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.loading);
                Intent movetoactivity3 =new Intent(MainActivity4.this, MainActivity3.class);
                movetoactivity3.putExtra("Emi", String.valueOf(r_emi));
                movetoactivity3.putExtra("Ti",String.valueOf(r_ti));
                startActivity(movetoactivity3);
                finish();
            }
        };
        Handler han = new Handler();
        han.postDelayed(rnew,2500);
        Toast.makeText(getBaseContext(),"Calculating...",Toast.LENGTH_SHORT).show();
    }
}