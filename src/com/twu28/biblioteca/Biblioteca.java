package com.twu28.biblioteca;

import com.sun.deploy.net.proxy.StaticProxyManager;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {
    public static void main(String[] args)throws IOException {
    Library BangaloreLibrary = new Library(5);
    BangaloreLibrary.addBook("Head First java");
    BangaloreLibrary.addBook("Harry potter1");
    BangaloreLibrary.addBook("The da vinci code");
    BangaloreLibrary.addBook("A game of thrones");
    BangaloreLibrary.addBook("A clash of kings");

    Menu myMenu= new Menu(7);
    myMenu.menuOptions[0]="1. View list of books in the library";
    myMenu.menuOptions[1]="2. Reserve a book from the library";
    myMenu.menuOptions[2]="3. Check library number";
    myMenu.menuOptions[3]="4. View Movie List";
    myMenu.menuOptions[4]="5. Login";
    myMenu.menuOptions[5]="6. Logout";
    myMenu.menuOptions[6]="7. Exit the library system";

    MovieList mList = new MovieList(15);
    mList.addMovie("Batman begins","Christopher nolan",9);
    mList.addMovie("The Dark Knight","Christopher nolan",10);
    mList.addMovie("Titanic","James cameroon",9);
    mList.addMovie("Transformers","Michael Bay",8);
    mList.addMovie("The dark knight rises","christopher nolan",0);
    mList.addMovie("The happening","M night shyamalan",7);
    mList.addMovie("3 idiots","Rajkumar Hirani",9);
    mList.addMovie("Kal ho na ho","Nikhil advani",10);
    mList.addMovie("Bol Bachchan","Rohit shetty",5);
    mList.addMovie("Rowdy rathore","Prabhu deva",6);
    mList.addMovie("Lagaan","Ausutosh gawarikar",8);
    mList.addMovie("Taare zameen par","Aamir khan",9);
    mList.addMovie("War of the worlds","Steven speilberg",7);
    mList.addMovie("Avatar","James cameroon",9);
    mList.addMovie("Slumdog Millionaire","Daniel Boyle",8);

    CustomerList cList = new CustomerList();
    cList.allCustomers.add(new Customer("111-1112","batman"));
    cList.allCustomers.add(new Customer("111-1113","raghav07"));
    cList.allCustomers.add(new Customer("111-1114","caspiansea"));
    cList.allCustomers.add(new Customer("111-1115","armstrong"));
    cList.allCustomers.add(new Customer("111-1116","macbook"));


    String option;
    int integerOption;
    Scanner input = new Scanner(System.in);
    do{
        myMenu.displayMenu();
        option=input.nextLine();
        if(myMenu.inputValidation(option)) {
            integerOption = Integer.parseInt(option);
            myMenu.menuOptionSelected(integerOption,BangaloreLibrary,cList,mList);
        }
        else
            myMenu.menuOptionSelected(0, BangaloreLibrary, cList, mList);
            System.out.println(" ");
    }while(true);
    }
}