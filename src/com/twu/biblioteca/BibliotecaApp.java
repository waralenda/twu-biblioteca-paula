package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca!");
        Menu menu = new Menu();
        menu.display();
        menu.chooseOption();
    }
}
