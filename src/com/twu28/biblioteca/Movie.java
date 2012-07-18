package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/18/12
 * Time: 12:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    String name;
    String director;
    int rating;

    Movie(String movieName,String directorName, int movieRating){
        name = movieName;
        director = directorName;
        rating = movieRating;
    }

    public String getName(){
        return name;
    }

    public String getDirector(){
        return director;
    }

    public String getRating(){
        if(rating==0)
            return "N/A";
        else
            return Integer.toString(rating);
    }

    public List getMovieDetails() {
        List<String> details = new ArrayList<String>();
        details.add(name);
        details.add(director);
        details.add(getRating());
        return details;

    }
}
