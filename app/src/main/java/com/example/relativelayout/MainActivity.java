package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownTimer countDownTimer=new CountDownTimer(5000,100) {
            @Override
            public void onTick(long l) {
                Toast.makeText(MainActivity.this,l+ "hello", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();
    }
}