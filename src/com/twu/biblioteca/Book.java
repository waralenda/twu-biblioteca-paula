package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    int getYearPublished() {
        return year;
    }
    String getAuthor() {
        return author;
    }
    String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                title.equals(book.title) &&
                author.equals(book.author);
    }
}
