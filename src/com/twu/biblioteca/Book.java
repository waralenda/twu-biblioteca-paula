package com.twu.biblioteca;

public class Book extends Rentable {

    public Book(String title, String author, int year) {
        super(title, author, year);
    }

    int getYear() {
        return super.getYear();
    }
    String getAuthor() {
        return super.getCreator();
    }
    String getTitle() {
        return super.getTitle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return this.year == book.year &&
                title.equals(book.title) &&
                creator.equals(book.creator);
    }
}
