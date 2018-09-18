package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean available = true;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void setUnavailable() {
        available = false;
    }
    void setAvailable() {
        available = true;
    }
    boolean getAvailability() {
        return available;
    }

    String getAuthor() {
        return author;
    }

    int getYearPublished() {
        return year;
    }

}
