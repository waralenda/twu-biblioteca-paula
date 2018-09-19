package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca!");
        List listOfBooks = new ArrayList();
        Library library = new Library(listOfBooks);
        Menu menu = new Menu(library);
        menu.chooseOption();
    }
}
