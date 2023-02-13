package com.example.seucinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_movie);
        Button btnThird = findViewById(R.id.button6);
        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(getApplicationContext(),UserInformation.class);
                startActivity(thirdIntent);
            }
        });
    }

    public static class MovieModel {
        String movieName;
        String movieAbbreviation;
        String movieAbbreviationOnSmall;
        int image;

        public MovieModel(String movieName, String movieAbbreviation, String movieAbbreviationOnSmall, int image) {
            this.movieName = movieName;
            this.movieAbbreviation = movieAbbreviation;
            this.movieAbbreviationOnSmall = movieAbbreviationOnSmall;
            this.image = image;
        }

        public String getMovieName() {
            return movieName;
        }

        public String getMovieAbbreviation() {
            return movieAbbreviation;
        }

        public String getMovieAbbreviationOnSmall() {
            return movieAbbreviationOnSmall;
        }

        public int getImage() {
            return image;
        }
    }
}