package com.twu28.biblioteca;

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

   public void menuOptionSelected(int selectedOption,Library collection, Customer user, MovieList mList){
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

          case 3 :System.out.println("Your Library number is:" + user.libraryNumber);
                   break;
          case 5: System.out.println("Please talk to Librarian. Thank you.");
                   System.exit(0);
                   break;
          case 4: System.out.println("Movie List");
                    mList.displayMovieList();
           default: System.out.println("Please select a valid menu option");
                  break;
       }
   }

    public int inputValidation(String option) {
       int integerOption;
       try{
           integerOption= Integer.parseInt(option);
       }
       catch (NumberFormatException e){
              return 0;
       }
       if (integerOption<1||integerOption>menuOptions.length)
           return 0;

        return integerOption;
    }
}
