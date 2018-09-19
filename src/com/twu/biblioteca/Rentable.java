package com.twu.biblioteca;

public class Rentable {
    protected String title;
    protected String creator;
    protected int year;

    public Rentable(String title, String creator, int year) {
        this.title = title;
        this.creator = creator;
        this.year = year;
    }

    int getYear() {
        return year;
    }
    String getCreator() {
        return creator;
    }
    String getTitle() {
        return title;
    }

}
