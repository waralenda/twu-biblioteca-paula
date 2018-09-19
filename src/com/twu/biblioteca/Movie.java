package com.twu.biblioteca;

public class Movie extends Rentable {
    private int rating;

    public Movie(String title, String director, int year, int rating) {
        super(title, director, year);
        this.rating = rating;
    }

    int getYear() {
        return super.getYear();
    }
    String getDirector() {
        return super.getCreator();
    }
    String getTitle() {
        return super.getTitle();
    }
    int getRating() {
        return rating;
    }
}
