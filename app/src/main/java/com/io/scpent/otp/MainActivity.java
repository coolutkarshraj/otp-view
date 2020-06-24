package com.io.scpent.otp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com.io.scpent.otpview.MainActivity.s(MainActivity.this,"this is first toast of library");
    }
}
