package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 1:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    String userName;
    String password;


    Customer(String uName, String pass){
        userName = uName;
        password =pass;

    }

    public String login(String uName,String pass){
        if((userName==uName)&&(pass==password)){

            return("Login successful");
        }
        else {
            return "Invalid username or password";
        }
    }


    public String getLibraryNumber(){
        return userName;
    }
}
