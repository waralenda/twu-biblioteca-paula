package com.twu.biblioteca;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Menu {
    private Scanner takeInput = new Scanner(System.in);
    private List listOfBooks = new ArrayList();
    private Library library;

    public Menu(Library library) {
        this.library = library;
    }

    void display() {
        System.out.println("Choose one of the following options:");
        System.out.println("    1) List of all books");
        System.out.println("    2) Checkout book");
        System.out.println("    3) Return book");
        System.out.println("    4) Quit");
    }

    void chooseOption() {
        int choice = takeInput.nextInt();
        if (this.checkIfValid(choice);){
            switch (choice) {
                case 1: {
                    library.listBooks();
                    this.display();
                    this.chooseOption();
                    break;
                }
                case 2: {
                    System.out.println("What is the title of the book you would like to checkout?");
                    String title = takeInput.next();
                    System.out.println("Who is the author of the book you would like to checkout?");
                    String author = takeInput.next();
                    System.out.println("When was this book published?");
                    int year = takeInput.nextInt();
                    Book b = new Book(title, author, year);
                    library.checkoutBook(b, listOfBooks);
                    this.display();
                    this.chooseOption();
                    break;
                }
                case 3: {
                    System.out.println("What is the title of the book you would like to return?");
                    String title = takeInput.next();
                    System.out.println("Who is the author of the book you would like to return?");
                    String author = takeInput.next();
                    System.out.println("When was this book published?");
                    int year = takeInput.nextInt();
                    Book b = new Book(title, author, year);
                    library.returnBook(b, listOfBooks);
                    this.display();
                    this.chooseOption();
                    break;
                }


            }
        }


    }
}
