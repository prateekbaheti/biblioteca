package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {
    public static void main(String[] args){
       LibraryCollection Bangalorelibrary = new LibraryCollection(5);
       Bangalorelibrary.allBooks[0]= new Book("Head first java");
       Bangalorelibrary.allBooks[1]= new Book("Harry potter1");
       Bangalorelibrary.allBooks[2]= new Book("The da vinci code");
       Bangalorelibrary.allBooks[3]= new Book("A game of thrones");
       Bangalorelibrary.allBooks[4]= new Book("A clash of kings");

       Customer []Bangalorelibrarycustomers = new Customer[3];
       Bangalorelibrarycustomers[0]= new Customer("Hari",12);
       Bangalorelibrarycustomers[1]= new Customer("Shyam",16);
       Bangalorelibrarycustomers[2]= new Customer("John",32);

    }
}