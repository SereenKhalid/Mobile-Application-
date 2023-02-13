package com.example.seucinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_movie);
        Button ticket2 = findViewById(R.id.button5);
        ticket2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent catMuvi = new Intent(getApplicationContext(), UserInformation.class);
                startActivity(catMuvi);
            }
        });
    }
}