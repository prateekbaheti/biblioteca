package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/12/12
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    String name;
    boolean availability;

    Book(String names){
         name=names;
         availability= true;

    }

    public String reserveBook() {
        if(availability)                    // if book is available its booked and true returned
        {
            availability=false;
            return "Thank You! Enjoy the book.";
        }
        else
            return "Sorry we don't have that book yet.";
    }

    public boolean isAvailable() {
        return availability;
    }

    public void showBookDetails() {
        System.out.println(name);
    }
}
