package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/18/12
 * Time: 1:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    @Test
    public void testGetName() throws Exception {
     Movie movie1 = new Movie("The dark knight","Christopher nolan",10);
     assertEquals(movie1.getName(),"The dark knight");
    }

    @Test
    public void testGetDirector() throws Exception {
        Movie movie1 = new Movie("The dark knight","Christopher nolan",10);
        assertEquals(movie1.getDirector(),"Christopher nolan");
    }

    @Test
    public void testGetRating() throws Exception {
        Movie movie1 = new Movie("The dark knight","Christopher nolan",10);
        assertEquals(movie1.getRating(),"10");
    }

    @Test
    public void testGetRating2() throws Exception {
        Movie movie1 = new Movie("The dark knight","Christopher nolan",0);
        assertEquals(movie1.getRating(),"N/A");
    }

    @Test
    public void testGetMovieDetails() throws Exception {
        Movie movie1 = new Movie("The dark knight","Christopher nolan",10);
        String []details = new String[3];
        details[0] = "The dark knight";
        details[1] = "Christopher nolan";
        details[2] = "10";
        assertEquals((movie1.getMovieDetails())[0],details[0]);
        assertEquals((movie1.getMovieDetails())[1],details[1]);
        assertEquals((movie1.getMovieDetails())[2],details[2]);
    }
}
