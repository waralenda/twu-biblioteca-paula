package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class TestLibrarySecondRelease {
    public static void main(String[] args) {
        User user1 = new User("111-1111");
        User user2 = new User("222-2222");

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);

        Library library = new Library(new ArrayList<Book>(), users);

        Menu menu = new Menu(library);

        menu.chooseOption();

    }
}


