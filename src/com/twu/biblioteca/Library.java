package com.twu.biblioteca;

import java.util.List;

public class Library extends Content {

    public Library(List<Book> books) {
        super((List<Rentable>)(Object) books);
    }

    public List<Book> getListOfBooks() {
        return (List<Book>)(Object) super.getContents();
    }

    public List<Book> getAvailableBooks() {
        return (List<Book>)(Object) super.getAvailableContent();
    }

    public List<Book> getUnavailableBooks() {
        return (List<Book>)(Object) super.getUnavailableContent();
    }


    void checkoutBook(Book b){
        if (super.checkoutItem(b)) {
            System.out.println("Thank you! Enjoy the book!");
        }
        else {
            System.out.println("That book is not available. Please check your spelling or try renting a different book.");
        }
    }


    void returnBook(Book b){
        if (super.returnItem(b)) {
            System.out.println("Thank you for returning the book!");
        }
        else {
            System.out.println("That is not a valid book to return. Please check your spelling or try returning a different book.");
        }
    }


    void listBooks() {
        printFourColumns("Title", "Author", "Year Published", "Availability");
        System.out.println("-----------------------------------------------------------------------------------");
        for (Book b : this.getListOfBooks()){
            if(getAvailableBooks().contains(b)){
                printFourColumns(b.getTitle(), b.getAuthor(), b.getYear(), true);
            }
            else if(getUnavailableBooks().contains(b)) {
                printFourColumns(b.getTitle(), b.getAuthor(), b.getYear(), false);
            }

        }
    }


    private void printFourColumns(Object column1, Object column2, Object column3, Object column4) {
        System.out.printf("%-22s%-22s%-22s%-22s%n", column1, column2, column3, column4);
    }

}