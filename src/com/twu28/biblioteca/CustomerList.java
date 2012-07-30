package com.twu28.biblioteca;

import javax.security.auth.login.LoginContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/18/12
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerList {
    List<Customer> allCustomers;
    public static int loggedInUser;

    CustomerList(){
     allCustomers = new ArrayList<Customer>();
        loggedInUser = 0;
     allCustomers.add(new Customer("111-1111","Librarian"));
    }

    public String customerLogin(String user,String pass){
       if(loggedInUser!=0)
           return "A user is already logged in";

        boolean found = false;
      String name;
      int i;
        for(i =0;i<allCustomers.size();i++){
              name = (allCustomers.get(i)).userName;
            if(name.equals(user)){
              found = true;
              break;
            }
        }
          if(!found) {
              return "Invalid username or password";
          }
         else {
              String result= (allCustomers.get(i)).login(user, pass);
              if(result.equals("Login successful"))
                  loggedInUser=i;
              return result;
          }


    }

    public void logOut() {
        loggedInUser = 0;
    }


    public String getLibraryNumber() {
        if(loggedInUser==0)
            return("Please talk to the librarian");
        else
            return (allCustomers.get(loggedInUser)).getLibraryNumber();

    }
}
