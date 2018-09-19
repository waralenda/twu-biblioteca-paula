package com.twu.biblioteca;
import java.util.Scanner;

public class Login {
    private String username;
    private Scanner takeInput = new Scanner(System.in);

    public String login() {
        System.out.print("Enter username: ");
        username = takeInput.next();
        if (!this.isValidUsername(username)){
            System.out.println("This username is invalid, try again");
            login();
        }
        else {
            System.out.print("Enter password: ");
            takeInput.next();
        }
        return username;
    }

    public String getUsername(){
        return this.username;
    }

    protected boolean isValidUsername(String username){
        if(username.length() != 8){
            System.out.println("Incorrect format: username too short or too long");
            return false;
        }
        else if(username.charAt(3) != '-'){
            System.out.println("Incorrect format: '-' is missing.");
            return false;
        }
        else {
            return true;
        }
    }


}
