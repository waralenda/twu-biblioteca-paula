package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Moviary extends Content {

    public Moviary(List<Movie> movies) {
        super((List<Rentable>)(Object) movies);
    }

    public List<Movie> getListOfMovies() {
        return (List<Movie>)(Object) super.getContents();
    }

    public List<Movie> getAvailableMovies() {
        return (List<Movie>)(Object) super.getAvailableContent();
    }

    public List<Movie> getUnavailableMovies() {
        return (List<Movie>)(Object) super.getUnavailableContent();
    }

    void checkoutMovie(Movie m){
        if (super.checkoutItem(m)) {
            System.out.println("Thank you! Enjoy the movie!");
        }
        else {
            System.out.println("That movie is not available. Please check your spelling or try renting a different movie.");
        }
    }

    void returnMovie(Movie m) {
        if (super.returnItem(m)){
            System.out.println("Thank you for returning the movie!");
        }
        else {
            System.out.println("That is not a valid movie to return. Please check your spelling or try returning a different movie.");
        }
    }

    void listMovies() {
        printFiveColumns("Title", "Director", "Year Published", "Rating", "Availability");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (Movie m : this.getListOfMovies()){
            if(getAvailableMovies().contains(m)){
                printFiveColumns(m.getTitle(), m.getDirector(), m.getYear(), m.getRating(), true);
            }
            else if(getUnavailableMovies().contains(m)) {
                printFiveColumns(m.getTitle(), m.getDirector(), m.getYear(), m.getRating(), false);
            }

        }
    }


    private void printFiveColumns(Object column1, Object column2, Object column3, Object column4, Object column5) {
        System.out.printf("%-19s%-19s%-19s%-19s%-19s%n", column1, column2, column3, column4, column5);
    }
}
