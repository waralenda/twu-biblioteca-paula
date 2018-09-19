package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

public class TestLibraryFirstRelease {
    public static void main(String[] args) {
        Book book1 = new Book("Title1", "Author1", 1991);
        Book book2 = new Book("Title2", "Author2", 1992);

        List<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);

        Library library = new Library(listOfBooks);

        Menu menu = new Menu(library);

        menu.chooseOption();

    }
}
