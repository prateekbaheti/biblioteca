package com.twu28.biblioteca;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {
    public static void main(String[] args){
        Library Bangalorelibrary = new Library(5);
        Bangalorelibrary.addBook("Head first java");
        Bangalorelibrary.addBook("Harry potter1");
        Bangalorelibrary.addBook("The da vinci code");
        Bangalorelibrary.addBook("A game of thrones");
        Bangalorelibrary.addBook("A clash of kings");

        Customer presentUser = new Customer("Bruce",125);
        Menu myMenu = new Menu(5);
        myMenu.menuOptions[0]="1. View the list of books in the Library";
        myMenu.menuOptions[1]="2. Reserve a book from the Library";
        myMenu.menuOptions[2]="3. Check library number";
        myMenu.menuOptions[4]="5. Exit the library system";
        myMenu.menuOptions[3]="4. View Movie List";
        System.out.println("Welcome to the Bangalore public Library");
        String option;
        int integerOption;
        Scanner input = new Scanner(System.in);
        do{
            myMenu.displayMenu();
            option = input.nextLine();
            integerOption= myMenu.inputValidation(option);
            myMenu.menuOptionSelected(integerOption,Bangalorelibrary,presentUser);
            System.out.println(" ");
        }while(true);
    }
}