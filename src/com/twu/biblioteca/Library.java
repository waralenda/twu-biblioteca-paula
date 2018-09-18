package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> listOfBooks = new ArrayList<Book>();

    public Library(List listOfBooks) {
        this.listOfBooks = listOfBooks;
    }


}
