package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Runnable r = new Runnable() {
            public void run() {
                Intent switchtomainactivityintent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(switchtomainactivityintent);
                finish();
            }
        };
        Handler handler = new Handler();
        handler.postDelayed(r,3000);
    }
}