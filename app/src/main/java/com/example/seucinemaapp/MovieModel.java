package com.example.seucinemaapp;

public class MovieModel {
    String movieName;
    String movieAbbreviation;
    String movieAbbreviationSmall;
    int image;

    public MovieModel(String movieName, String movieAbbreviation, String movieAbbreviationSmall, int image) {
        this.movieName = movieName;
        this.movieAbbreviation = movieAbbreviation;
        this.movieAbbreviationSmall = movieAbbreviationSmall;
        this.image = image;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieAbbreviation() {
        return movieAbbreviation;
    }

    public String getMovieAbbreviationSmall() {
        return movieAbbreviationSmall;
    }

    public int getImage() {
        return image;
    }
}
