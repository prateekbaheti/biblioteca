package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 3:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {

    @Test
    public void testReserveBookFromCollection() throws Exception {                       // book not present in list;
        Library books;
        books = new Library(3);
        books.allBooks.add(new Book("abc"));
        books.allBooks.add(new Book("fgh"));
        books.allBooks.add(new Book("pqr"));

        assertEquals(books.reserveBookFromCollection("xyz"),"Please select a book from the books list of the library");
    }



    @Test
    public void testReserveBookFromCollection2() throws Exception {                  //Book available in library
        Library books = new Library(3);
        books.allBooks.add(new Book("abc"));
        books.allBooks.add(new Book("fgh"));
        books.allBooks.add(new Book("pqr"));
        assertEquals(books.reserveBookFromCollection("fgh"),"Thank You! Enjoy the book.");
    }




    @Test                                                                             // Book unavailable in library
    public void testReserveBookFromCollection3() throws Exception {
        Library books = new Library(3);
        books.allBooks.add(new Book("abc"));
        books.allBooks.add(new Book("fgh"));
        books.allBooks.add(new Book("pqr"));
        books.allBooks.get(2).reserveBook();
        assertEquals(books.reserveBookFromCollection("pqr"),"Sorry we don't have that book yet.");

    }

    @Test
    public void testGetbooks() throws Exception {
        Library books = new Library(3);
        books.allBooks.add(new Book("abc"));
        books.allBooks.add(new Book("fgh"));
        books.allBooks.add(new Book("pqr"));
        List<String> bookslist = new ArrayList<String>();
        bookslist.add("abc");
        bookslist.add("fgh");
        bookslist.add("pqr");
        assertEquals(bookslist,books.getBooks());

    }

    @Test
    public void testAddBook() throws Exception {
        Library books;
        books = new Library(3);
        books.allBooks.add(new Book("abc"));
        books.allBooks.add(new Book("fgh"));
        books.allBooks.add(new Book("pqr"));
        List<String> bookslist = new ArrayList<String>();
        bookslist.add("abc");
        bookslist.add("fgh");
        bookslist.add("pqr");
        bookslist.add("lmn");
        books.addBook("lmn");
        assertEquals(bookslist,books.getBooks());


    }

}
