package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/18/12
 * Time: 1:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class MovieListTest {
    @Test
    public void testGetMoviesList() throws Exception {
     MovieList mList = new MovieList(2);
        mList.allMovies.add(new Movie("Hugo","abc",6));
        mList.allMovies.add(new Movie("Juno","xyz",0));
        List <List<String>> checkList = new ArrayList<List<String>>();
        List<String> oneMovie = new ArrayList<String>();
        List<String> twoMovie = new ArrayList<String>();
        oneMovie.add("Hugo"); oneMovie.add("abc"); oneMovie.add("6");
        checkList.add(oneMovie);
        twoMovie.add("Juno"); twoMovie.add("xyz"); twoMovie.add("N/A");
        checkList.add(twoMovie);
        assertEquals(checkList,mList.getMovieList());

    }
}
