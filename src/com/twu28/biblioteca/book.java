package com.twu28.biblioteca;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/12/12
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class book {
    String name;
    boolean availability;

    book(String names){
         name=names;
         availability= true;

    }

    public boolean Reservebook() {
        if(availability)                    // if book is available its booked and true returned
        {
            availability=false;
            return true;
        }
        else
            return false;
    }

    public boolean IsAvailable() {
        return availability;
    }

    public void showbookdetails() {
        System.out.println(name);
    }
}
