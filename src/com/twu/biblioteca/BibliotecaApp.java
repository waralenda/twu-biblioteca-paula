package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca!");
        List<Book> listOfBooks = new ArrayList<Book>();
        List<User> users = new ArrayList<User>();
        Library library = new Library(listOfBooks, users);
        List<Movie> listOfMovies = new ArrayList<Movie>();
        Moviary moviary = new Moviary(listOfMovies);
        Menu menu = new Menu(library, moviary);
        menu.chooseOption();
    }
}
