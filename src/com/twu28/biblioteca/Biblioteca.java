package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {
    public static void main(String[] args){
       LibraryCollection Bangalorelibrary = new LibraryCollection(5);
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
       int option;
       do{
        option = myMenu.displayMenu();
        if(option<1||option>myMenu.menuOptions.length)
            System.out.println("Select a valid option");
        myMenu.menuOptionSelected(option,Bangalorelibrary,presentUser);
        System.out.println(" ");
       }while(true);
    }
}