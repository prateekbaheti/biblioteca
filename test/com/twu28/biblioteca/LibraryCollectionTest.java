package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 3:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryCollectionTest {
    @Test
    public void testReserveBookFromCollection() throws Exception {                       // book not present in list;
         LibraryCollection books;
         books = new LibraryCollection(3);
         books.allBooks[0]= new Book("abc");
         books.allBooks[1] =new Book("fgh");
         books.allBooks[2] =new Book("pqr");

        assertEquals(books.reserveBookFromCollection("xyz"),"Please select a book from the books list of the library");
    }



    @Test
    public void testReserveBookFromCollection2() throws Exception {                  //Book available in library
         LibraryCollection books = new LibraryCollection(3);
         books.allBooks[0]= new Book("abc");
         books.allBooks[1] =new Book("fgh");
         books.allBooks[2] =new Book("pqr");
         assertEquals(books.reserveBookFromCollection("fgh"),"Thank You! Enjoy the book.");
    }


    @Test                                                                             // Book unavailable in library
    public void testReserveBookFromCollection3() throws Exception {
        LibraryCollection books = new LibraryCollection(3);
        books.allBooks[0]= new Book("abc");
        books.allBooks[1] =new Book("fgh");
        books.allBooks[2] =new Book("pqr");
        books.allBooks[2].reserveBook();
        assertEquals(books.reserveBookFromCollection("pqr"),"Sorry we don't have that book yet.");
    }
}
