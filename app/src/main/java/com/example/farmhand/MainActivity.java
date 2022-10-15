package com.example.farmhand;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText number,otp;
    Button labour,farmer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.number);
        otp=findViewById(R.id.otp);
        labour=findViewById(R.id.labour_login);
        farmer=findViewById(R.id.farmer);

       
    }
}