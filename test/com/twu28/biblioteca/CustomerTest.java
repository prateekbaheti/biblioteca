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
    public void testGetLibraryNumber() throws Exception {
        Customer user1 = new Customer("111-1113","password");
        assertEquals(user1.getLibraryNumber(),"111-1113");

    }

    @Test
    public void testLogin() throws Exception {                          //Successful login
        Customer user1 = new Customer("111-1113","password");
        String login = user1.login("111-1113","password");
        assertEquals("Login successful",login);
    }

    @Test
    public void testLogin2() throws Exception {                          //unsuccessful login wrong username
        Customer user1 = new Customer("11-1113","password");
        String login = user1.login("111-1113","password");
        assertEquals("Invalid username or password",login);
    }
    @Test
    public void testLogin3() throws Exception {                          //unsuccessful login wrong password
        Customer user1 = new Customer("111-1113","pasword");
        String login = user1.login("111-1113","password");
        assertEquals("Invalid username or password",login);
    }
}
