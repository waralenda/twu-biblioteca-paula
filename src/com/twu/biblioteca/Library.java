package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> listOfBooks = new ArrayList();


    public Library(List listOfBooks) {
        this.listOfBooks = listOfBooks;
    }


    public List<Book> getListOfBooks() {
        return this.listOfBooks;
    }


    void checkoutBook(Book b, List<Book> listOfBooks){
        if (listOfBooks.contains(b)){
            b.setUnavailable();
            System.out.println("Thank you! Enjoy the book");
        }
        else {
            System.out.println("That book is not available. Please check your spelling or try renting a different book");
        }
    }


    void returnBook(Book b, List<Book> listOfBooks){
        if (listOfBooks.contains(b)){
            b.setAvailable();
            System.out.println("Thank you for returning the book");
        }
        else {
            System.out.println("That is not a valid book to return. Please check your spelling or try renting a different book");
        }
    }


    void listBooks(List<Book> listOfBooks) {
        printThreeColumns("Title", "Author", "Year Published");
        System.out.println("------------------------------------------------------------");
        for (Book b : listOfBooks){
            printThreeColumns(b.getTitle(), b.getAuthor(), b.getYearPublished());
        }
    }


    private void printThreeColumns(Object column1, Object column2, Object column3) {
        System.out.printf("%-22s%-22s%-22s%n", column1, column2, column3);
    }

}
