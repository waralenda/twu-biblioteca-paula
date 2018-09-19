package com.twu.biblioteca;

public class User {
    private String name;
    private String email;
    private String phone;
    private String username;

    public User(String username){
        this.username = username;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void printUserData() {
        System.out.println("Name                 " + name);
        System.out.println("Email address       " + email);
        System.out.println("Phone number        " + phone);
    }

    public String getUsername(){
        return username;
    }

}
