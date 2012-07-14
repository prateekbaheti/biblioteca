package com.twu28.biblioteca;

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

   public int displayMenu()
   {

       for(int i=0;i<menuOptions.length;i++)
           System.out.println(menuOptions[i]);

       System.out.print("What would you like to do? Please enter menu option number:");
       Scanner inputoption = new Scanner(System.in);
       String stringOption = inputoption.nextLine();
       int option =Integer.parseInt(stringOption);
       return option;
   }

   public void menuOptionSelected(int selectedOption,LibraryCollection collection, Customer user){
       Scanner inputoption = new Scanner(System.in);
       switch(selectedOption) {
          case 1 : collection.showBooks();
                   break;
          case 2 : System.out.print("Please enter the book name you would like to reserve:");
                   String bookToReserve = inputoption.nextLine();
                   System.out.println(collection.reserveBookFromCollection(bookToReserve));
                   break;

          case 3 :System.out.println("Your Library number is:" + user.libraryNumber);
                   break;
          case 4: System.out.println("Please talk to Librarian. Thank you.");
                   System.exit(0);
                   break;
          default: break;
       }
   }

}
