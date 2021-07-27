package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final TextView TI = (TextView) findViewById(R.id.interest_total_tv);
        final TextView result = (TextView) findViewById(R.id.emi_tv);
        String emi = getIntent().getStringExtra("Emi");
        String ti = getIntent().getStringExtra("Ti");
        result.setText(String.valueOf(emi));
        TI.setText(String.valueOf(ti));

    }
}