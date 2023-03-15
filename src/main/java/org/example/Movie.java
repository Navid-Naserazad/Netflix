package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
    /*
     *Movie is extended from TVShow and has extra attribute length.
     */
    private String length;

    public Movie(String title, String genre, int releaseYear, String duration, double rating, String length)
    {
        super(title, genre, releaseYear, duration, rating);
        this.length = length;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title:'" + getTitle() + '\'' +
                ", genre:'" + getGenre() + '\'' +
                ", releaseYear:" + getReleaseYear() +
                ", duration:'" + getDuration() + '\'' +
                ", rating:" + getRating() +
                ", length:'" + length + '\'' +
                ", casts:" + casts +
                '}';
    }
}

