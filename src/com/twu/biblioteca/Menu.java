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

    public void display() {
        System.out.println("Choose one of the following options:");
        System.out.println("    1) List of all books");
        System.out.println("    2) Checkout book");
        System.out.println("    3) Return book");
        System.out.println("    4) Quit");
    }

    public void chooseOption() {
        int choice = takeInput.nextInt();
        if (this.checkIfValid(choice)) {
            switch (choice) {
                case 1: {
                    library.listBooks();
                    this.display();
                    this.chooseOption();
                    break;
                }
                case 2: {
                    Book b = getBookDetails();
                    library.checkoutBook(b, listOfBooks);
                    this.display();
                    this.chooseOption();
                    break;
                }
                case 3: {
                    Book b = getBookDetails();
                    library.returnBook(b, listOfBooks);
                    this.display();
                    this.chooseOption();
                    break;
                }
            }
        }

        else {
            System.out.println("Select a valid option!");
            this.display();
            this.chooseOption();
        }
    }


    public boolean checkIfValid(int choice) {
        return (choice == 1 || choice == 2 || choice == 3 || choice == 4);
    }


    private Book getBookDetails() {
        System.out.println("What is the title of the book you would like to checkout?");
        String title = takeInput.next();
        System.out.println("Who is the author of the book you would like to checkout?");
        String author = takeInput.next();
        System.out.println("When was this book published?");
        int year = takeInput.nextInt();
        return new Book(title, author, year);
    }
}
