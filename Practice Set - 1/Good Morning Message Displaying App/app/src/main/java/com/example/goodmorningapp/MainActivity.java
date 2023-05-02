package com.example.goodmorningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Good Morning !!", Toast.LENGTH_SHORT).show();
        textview = findViewById(R.id.textview);
        textview.setText("Good Morning !!");

    }
}