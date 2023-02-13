package com.example.seucinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Created by Sereen, Noor, Fatimah, and Huda",
                Toast.LENGTH_LONG).show();
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navigate = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(navigate);
            }
        });
        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movie = new Intent(getApplicationContext(),SecondMovie.class);
                startActivity(movie);
            }
        });
        Button bts = findViewById(R.id.button3);
        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent here = new Intent(getApplicationContext(),ThirdMovie.class);
                startActivity(here);
            }
        });

        Button later = findViewById(R.id.button7);
        later.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent futureMovie = new Intent(getApplicationContext(),LaterMovies.class);
                startActivity(futureMovie);
            }
        });

        Button moreMovies = findViewById(R.id.button8);
        moreMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent more = new Intent(getApplicationContext(),MainActivityRecyclerView.class);
                startActivity(more);
            }
        });

    }
    @Override
        protected void onRestart(){
            super.onRestart();
            Toast.makeText(this, "Welcome to our App ",
                    Toast.LENGTH_LONG).show(); }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Enjoy !",
                Toast.LENGTH_LONG).show(); }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "You can check future movies list ",
                Toast.LENGTH_LONG).show(); }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, " Thank you for using Our App ",
                Toast.LENGTH_LONG).show(); }

}


