package com.twu28.biblioteca;

import java.util.ArrayList;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 1:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    Book[] allBooks;

  Library(int numberOfBooks){
       allBooks = new Book[numberOfBooks];

  }

  public List getBooks()
    {
        List<String> booksList = new ArrayList<String>(allBooks.length);
        for(int i =0; i< allBooks.length;i++)
            booksList.add(allBooks[i].getname());
        return booksList;
    }

    public String reserveBookFromCollection(String bookName) {
        boolean found = false;

        int i;
        for (i = 0; i < allBooks.length; i++) {
            if (bookName.equals(allBooks[i].name))
                found = true;
        }
        if (found == false)
            return "Please select a book from the books list of the library";

        else
            return allBooks[i-1].reserveBook();
    }



}
