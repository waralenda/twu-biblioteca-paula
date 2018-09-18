package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> listOfBooks = new ArrayList<Book>();

    public Library(List listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    void checkout(Book b, List<Book> listOfBooks){
        if (listOfBooks.contains(b)){
            b.setUnavailable();
            System.out.println("Thank you! Enjoy the book");
        }
        else {
            System.out.println("That book is not available. Please check your spelling or try renting a different book");
            
        }
    }


}
