package com.twu.biblioteca;

public class Movie extends Rentable {
    private Object rating;

    public Movie(String title, String director, int year, Object rating) {
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
    Object getRating() {
        return rating;
    }
}
