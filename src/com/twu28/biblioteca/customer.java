package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 1:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class customer {
    String Customername;
    int librarynumber;

    customer(String name, int libraryno){
        librarynumber = libraryno;
        Customername=name;

    }

    public int getlibrarynumber(){
        return librarynumber;
    }
}
