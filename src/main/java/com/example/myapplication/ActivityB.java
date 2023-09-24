package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);


        Button button = findViewById(R.id.goToC);


        button.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityB.this, ActivityC.class);
            startActivity(intent);
        });



    }
}