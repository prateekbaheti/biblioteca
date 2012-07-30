package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {
    String[] menuOptions;

    Menu(int numberOfOptions){
      menuOptions = new String[numberOfOptions];

    }

   public void displayMenu()
   {

       for(int i=0;i<menuOptions.length;i++)
           System.out.println(menuOptions[i]);

       System.out.print("What would you like to do? Please enter menu option number:");

   }

   public void menuOptionSelected(int selectedOption,Library collection, CustomerList cList, MovieList mList) throws IOException {
       Scanner inputoption = new Scanner(System.in);
       switch(selectedOption) {
           case 1 : System.out.println(" \n"+"  Books List");
               List<String> listOfNames;
               listOfNames = collection.getBooks();
               for(int i=0;i<listOfNames.size();i++)
                   System.out.println(listOfNames.get(i));
               break;
           case 2 : System.out.print("Please enter the book name you would like to reserve:");
               String bookToReserve = inputoption.nextLine();
               System.out.println(collection.reserveBookFromCollection(bookToReserve));
               break;

           case 3 :System.out.println(cList.getLibraryNumber());
               break;
           case 7: System.out.println("Thank you.");
               System.exit(0);
               break;
           case 4: System .out.println("Movie List");
               List<List<String>> movList;
               movList = mList.getMovieList();
               System.out.println("[Movie    Director   Name]");
               for(int j=0;j<mList.allMovies.size();j++)
                   System.out.println(movList.get(j));
               break;
           case 5:System.out.println("Enter Username:");
               Scanner ip = new Scanner(System.in);
               String username = ip.nextLine();
               System.out.println("Enter password:");
               String password = ip.nextLine();
               System.out.println(cList.customerLogin(username,password));
               break;
           case 6:cList.logOut();
               break;

           default: System.out.println("Please select a valid menu option");
               break;
       }
   }

    public boolean inputValidation(String option) {
       int integerOption;
       try{
           integerOption= Integer.parseInt(option);
       }
       catch (NumberFormatException e){
              return false;
       }
       if (integerOption<1||integerOption>menuOptions.length)
           return false;

        return true;
    }
}
