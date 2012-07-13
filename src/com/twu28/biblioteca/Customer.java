package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 1:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    String customerName;
    int libraryNumber;

    Customer(String name, int libraryNo){
        libraryNumber = libraryNo;
        customerName =name;

    }

    public int getLibraryNumber(){
        return libraryNumber;
    }
}
