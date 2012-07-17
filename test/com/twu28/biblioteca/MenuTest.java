package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/17/12
 * Time: 12:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTest {
    @Test
    public void testInputValidation() throws Exception {                           // correct integer value entered
           Menu myMenu = new Menu(4);
           assertEquals(myMenu.inputValidation("1"),1);
    }

    @Test
    public void testInputValidation2() throws Exception {                           //Incorrect integer entered
        Menu myMenu = new Menu(4);
        assertEquals(myMenu.inputValidation("6"),0);
    }

    @Test
    public void testInputValidation3() throws Exception {                           //Integer not entered
        Menu myMenu = new Menu(4);
        assertEquals(myMenu.inputValidation("e"),0);
    }
}

