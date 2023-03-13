package org.example;

import java.util.ArrayList;

class TVShow {
    /*
     *The TVShow should have a title , genre, release year, duration and a rating.
     *The TVShow should have an ArrayList of the cast.
     */
    private String title;
    private String genre;
    private int releaseYear;
    private String duration;
    private double rating;
    public TVShow(String title, String genre, int releaseYear, String duration, double rating)
    {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "TVShow{" +
                "title:'" + title + '\'' +
                ", genre:'" + genre + '\'' +
                ", releaseYear:" + releaseYear +
                ", duration:'" + duration + '\'' +
                ", rating:" + rating +
                ", casts:" + casts +
                '}';
    }

    ArrayList<Cast> casts = new ArrayList<>();
}
