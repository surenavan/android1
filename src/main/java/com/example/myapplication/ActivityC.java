package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button buttonToA = findViewById(R.id.buttonCToA);
        Button buttonToB = findViewById(R.id.buttonCToB);
        Button buttonToD = findViewById(R.id.buttonCToD);
        Button buttonCloseC = findViewById(R.id.closeC);
        Button buttonCloseStack = findViewById(R.id.closeStack);




        buttonToA.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityA.class);
            startActivity(intent);
        });


        buttonToB.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityB.class);
            startActivity(intent);
        });




        buttonToD.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityD.class);
            finishAffinity();
            startActivity(intent);
        });

        buttonCloseC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityB.class);
            finishAffinity();
            startActivity(intent);
        });

        buttonCloseStack.setOnClickListener(view -> finishAffinity());







    }


}