package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/18/12
 * Time: 1:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class MovieList {
    List<Movie> allMovies;

    MovieList(int number){
     allMovies = new ArrayList<Movie>(number);
    }

    public void addMovie(String name,String director,int rating){
        allMovies.add(new Movie(name,director,rating));
    }

    public void displayMovieList(){
       System.out.
        }

    }
}
