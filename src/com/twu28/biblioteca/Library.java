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
    List<Book> allBooks;

  Library(int numberOfBooks){
       allBooks = new ArrayList<Book>(numberOfBooks);
       }



  public List getBooks()
    {
        List<String> booksList = new ArrayList<String>(allBooks.size());
        for(int i =0; i< allBooks.size();i++)
            booksList.add((allBooks.get(i)).getname());
        return booksList;
    }

    public String reserveBookFromCollection(String bookName) {
        boolean found = false;

        int i;
        for (i = 0; i < allBooks.size(); i++) {
            if ((allBooks.get(i)).name.equals(bookName))
                found = true;
        }
        if (found == false)
            return "Please select a book from the books list of the library";

        else {
            return (allBooks.get(i - 1)).reserveBook();
        }
    }


    public void addBook(String name) {
        allBooks.add(new Book(name)) ;
    }
}
