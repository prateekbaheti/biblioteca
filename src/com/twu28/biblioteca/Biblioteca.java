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
       Bangalorelibrary.allBooks[0]= new Book("Head first java");
       Bangalorelibrary.allBooks[1]= new Book("Harry potter1");
       Bangalorelibrary.allBooks[2]= new Book("The da vinci code");
       Bangalorelibrary.allBooks[3]= new Book("A game of thrones");
       Bangalorelibrary.allBooks[4]= new Book("A clash of kings");

       Customer presentUser = new Customer("Bruce",125);
       Menu myMenu = new Menu(4);
       myMenu.menuOptions[0]="1. View the list of books in the Library";
       myMenu.menuOptions[1]="2. Reserve a book from the Library";
       myMenu.menuOptions[2]="3. Check library number";
       myMenu.menuOptions[3]="4. Exit the library system";
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