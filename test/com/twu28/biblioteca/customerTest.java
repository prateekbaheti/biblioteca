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
public class customerTest {
    @Test
    public void testnewcustomer() throws Exception {
        customer user1= new customer("Prateek",22);
        assertEquals(user1.Customername,"Prateek");
        assertEquals(user1.librarynumber,22);
    }

    @Test
    public void testgetlibrarynumber() throws Exception {
        customer user1 = new customer("ravi",35);
        assertEquals(user1.getlibrarynumber(),35);

    }
}
