package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 1:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerTest {
    @Test
    public void testnewcustomer() throws Exception {
        Customer user1= new Customer("Prateek",22);
        assertEquals(user1.customerName,"Prateek");
        assertEquals(user1.libraryNumber,22);
    }

    @Test
    public void testGetLibraryNumber() throws Exception {
        Customer user1 = new Customer("ravi",35);
        assertEquals(user1.getLibraryNumber(),35);

    }
}
