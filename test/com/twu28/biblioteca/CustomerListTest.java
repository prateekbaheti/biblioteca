package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/18/12
 * Time: 5:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerListTest {
    @Test
    public void testCustomerlogin() throws Exception {
        CustomerList cList = new CustomerList();
        cList.allCustomers.add(new Customer("111-1112","abcd"));
        cList.allCustomers.add(new Customer("111-1113","pqrs"));
        assertEquals("Login successful",cList.customerLogin("111-1113","pqrs"));

    }

    @Test
    public void testCustomerlogin2() throws Exception {
        CustomerList cList = new CustomerList();
        cList.allCustomers.add(new Customer("111-1112","abcd"));
        cList.allCustomers.add(new Customer("111-1113","pqrs"));
        assertEquals("Invalid username or password",cList.customerLogin("111-1113","prs"));
    }

    @Test
    public void testCustomerlogin3() throws Exception {
        CustomerList cList = new CustomerList();
        cList.allCustomers.add(new Customer("111-1112","abcd"));
        cList.allCustomers.add(new Customer("111-1113","pqrs"));
        cList.customerLogin("111-1113","pqrs");
        assertEquals("A user is already logged in",cList.customerLogin("111-1113","prs"));
    }

    @Test
    public void testLogOut() throws Exception {
        CustomerList cList = new CustomerList();
        cList.allCustomers.add(new Customer("111-1112","abcd"));
        cList.allCustomers.add(new Customer("111-1113","pqrs"));
        cList.customerLogin("111-1113","pqrs");
        cList.logOut();
        assertEquals(0, CustomerList.loggedInUser);
    }

    @Test
    public void testGetUserLibraryNo() throws Exception {
        CustomerList cList = new CustomerList();
        cList.allCustomers.add(new Customer("111-1112","abcd"));
        cList.allCustomers.add(new Customer("111-1113","pqrs"));
        assertEquals("Please talk to the librarian",cList.getLibraryNumber());
    }

    public void testGetUserLibraryNo2() throws Exception {
        CustomerList cList = new CustomerList();
        cList.allCustomers.add(new Customer("111-1112","abcd"));
        cList.allCustomers.add(new Customer("111-1113","pqrs"));
        cList.customerLogin("111-1112","abcd");
        assertEquals("111-1112",cList.getLibraryNumber());
    }
}