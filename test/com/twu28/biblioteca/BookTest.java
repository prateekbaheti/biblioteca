package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/12/12
 * Time: 2:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest {
    @Test
    public void testbook() throws Exception {
    Book book1;
        book1 = new Book("lord of rings");
        assertEquals("lord of rings", book1.name);

    }

    @Test
    public void testsReservebook() throws Exception {
       Book book1 = new Book("Harry potter");
      assertEquals("Thank You! Enjoy the book.",book1.reserveBook());
      assertEquals("Sorry we don't have that book yet.",book1.reserveBook());
    }

    @Test
    public void testIsAvailable() throws Exception {
       Book book1=new Book("Deception point");
       assertEquals(true,book1.isAvailable());
       book1.reserveBook();
       assertEquals(false,book1.isAvailable());

    }
}
