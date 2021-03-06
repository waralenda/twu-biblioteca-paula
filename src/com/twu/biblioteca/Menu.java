package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner takeInput = new Scanner(System.in);
    private Library library;
    private Moviary moviary;
    private Login login = new Login();

    public Menu(Library library, Moviary moviary) {
        this.library = library;
        this.moviary = moviary;
    }

    public Menu(Library library) {
        this.library = library;
        this.moviary = new Moviary(new ArrayList<Movie>());
    }

    public Menu(Moviary moviary) {
        this.library = new Library(new ArrayList<Book>(), new ArrayList<User>());
        this.moviary = moviary;
    }

    public Menu() {
        this.library = new Library(new ArrayList<Book>(), new ArrayList<User>());
        this.moviary = new Moviary(new ArrayList<Movie>());
    }


    public void display() {
        System.out.println("Choose one of the following options:");
        System.out.println("    1) List of all books");
        System.out.println("    2) Checkout book");
        System.out.println("    3) Return book");
        System.out.println("    4) List all movies");
        System.out.println("    5) Checkout movie");
        System.out.println("    6) Return movie");
        System.out.println("    7) See user information");
        System.out.println("    8) Quit");
    }

    public void chooseOption() {
        this.display ();
        int choice = takeInput.nextInt();
        if (this.checkIfValid(choice)) {
            switch (choice) {
                case 1: {
                    library.listBooks();
                    this.chooseOption();
                    break;
                }
                case 2: {
                    login.login();
                    Book b = getBookDetails();
                    library.checkoutBook(b);
                    this.chooseOption();
                    break;
                }
                case 3: {
                    login.login();
                    Book b = getBookDetails();
                    library.returnBook(b);
                    this.chooseOption();
                    break;
                }
                case 4: {
                    moviary.listMovies();
                    this.chooseOption();
                    break;
                }
                case 5: {
                    login.login();
                    Movie m = getMovieDetails();
                    moviary.checkoutMovie(m);
                    this.chooseOption();
                    break;
                }
                case 6: {
                    login.login();
                    Movie m = getMovieDetails();
                    moviary.returnMovie(m);
                    this.chooseOption();
                    break;
                }
                case 7: {
                    String username = login.login();
                    User currentUser = library.findUser(username);
                    if (currentUser.getUsername() == "000-0000"){
                        System.out.println("User does not exist, please try again");
                        this.chooseOption();
                    }
                    else {
                        currentUser.printUserData();
                        this.chooseOption();
                    }
                }

            }
        }
        else {
            System.out.println("Select a valid option!");
            this.chooseOption();
        }
    }


    private Book getBookDetails() {
        System.out.println("What is the title of the book?");
        String title = takeInput.next();
        System.out.println("Who is the author of the book?");
        String author = takeInput.next();
        System.out.println("When was this book published?");
        int year = takeInput.nextInt();
        return new Book(title, author, year);
    }

    private Movie getMovieDetails() {
        System.out.println("What is the title of the movie?");
        String title = takeInput.next();
        System.out.println("Who directed the movie?");
        String director = takeInput.next();
        System.out.println("When was this movie released?");
        int year = takeInput.nextInt();
        return new Movie(title, director, year, 0);
    }

    protected boolean checkIfValid(int choice) {
        return (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7 || choice == 8);
    }


}
