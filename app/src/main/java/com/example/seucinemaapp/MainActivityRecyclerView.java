package com.example.seucinemaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityRecyclerView extends AppCompatActivity {

    ArrayList<MovieModel> movieModels = new ArrayList<>();

    int [] movieImages = {R.drawable.baseline_movie_24, R.drawable.baseline_movie_24,
            R.drawable.baseline_movie_24,R.drawable.baseline_movie_24,
            R.drawable.baseline_movie_24,R.drawable.baseline_movie_24,R.drawable.baseline_movie_24,
            R.drawable.baseline_movie_24,R.drawable.baseline_movie_24,R.drawable.baseline_movie_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler_view2);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setUpMovieModel();
        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(this,movieModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpMovieModel (){
        String[] movieName = getResources().getStringArray(R.array.movies_one_letter_txt);
        String [] movieAbbreviation = getResources().getStringArray(R.array.movies_three_letter_txt);
        String [] movieAbbreviationSmall = getResources().getStringArray(R.array.movies_one_letter_txt);

        for (int i = 0; i<movieName.length; i ++) {
            movieModels.add(new MovieModel(movieName[i],
                    movieAbbreviation[i],
                    movieAbbreviationSmall[i],
                   movieImages[i] ));

        }
    }
}