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
public class starttest {
    @Test
    public void testbook() throws Exception {
    book book1;
        book1 = new book("lord of rings");
        assertEquals("lord of rings", book1.name);

    }

    @Test
    public void testsReservebook() throws Exception {
       book book1 = new book("Harry potter");
      assertEquals(true,book1.Reservebook());
      assertEquals(false,book1.Reservebook());
    }

    @Test
    public void testIsAvailable() throws Exception {
       book book1=new book("Deception point");
       assertEquals(true,book1.IsAvailable());
       book1.Reservebook();
       assertEquals(false,book1.IsAvailable());

    }
}
