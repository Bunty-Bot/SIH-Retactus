package com.example.sihapp;

import static android.view.HapticFeedbackConstants.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt3, bt2, bt6, bt7, bt11, bt10, bt13, bt14;
    Vibrator vbr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt3 = findViewById(R.id.button3);
        bt2 = findViewById(R.id.button2);
        bt6 = findViewById(R.id.button6);
        bt7 = findViewById(R.id.button7);
        bt11 = findViewById(R.id.button11);
        bt10 = findViewById(R.id.button10);
        bt13 = findViewById(R.id.button13);
        bt14 = findViewById(R.id.button14);

        vbr = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vbr.vibrate(1000);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vbr.vibrate(1000);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vbr.vibrate(1000);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vbr.vibrate(1000);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vbr.vibrate(1000);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vbr.vibrate(1000);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vbr.vibrate(1000);
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vbr.vibrate(1000);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vbr.vibrate(1000);
            }
        });


    }
}