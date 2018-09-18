package com.twu.biblioteca;
import java.util.Scanner;

public class Menu {
    private Scanner takeInput = new Scanner(System.in);
   // private Library library = new Library();

  //  public Menu(Library library) {
 //       this.library = library;
 //   }

    void display() {
        System.out.println("Choose one of the following options:");
        System.out.println("    1) List of all books");
        System.out.println("    2) Checkout book");
        System.out.println("    3) Return book");
        System.out.println("    4) Quit");
    }

    void chooseOption() {
        System.out.println("Please choose one of the options listed above");
        int choice = takeInput.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1: {
                  //  library.listBooks();
                    System.out.println("Please choose one of the options listed above");
                    choice = takeInput.nextInt();
                }
                case 2: {
                    System.out.println("What is the title of the book you would like to checkout?");
                    String title = takeInput.nextLine();
                    System.out.println("Who is the author of the book you would like to checkout?");
                    String author = takeInput.nextLine();
                    System.out.println("When was this book published?");
                    int year = takeInput.nextInt();
                    Book b = new Book(title, author, year);
                   // library.checkoutBook(b);
                    System.out.println("Please choose one of the options listed above");
                    choice = takeInput.nextInt();
                }
                case 3: {
                    System.out.println("What is the title of the book you would like to return?");
                    String title = takeInput.nextLine();
                    System.out.println("Who is the author of the book you would like to return?");
                    String author = takeInput.nextLine();
                    System.out.println("When was this book published?");
                    int year = takeInput.nextInt();
                    Book b = new Book(title, author, year);
                   // library.returnBook(b);
                    System.out.println("Please choose one of the options listed above");
                    choice = takeInput.nextInt();
                }
            }
        }
    }


}
