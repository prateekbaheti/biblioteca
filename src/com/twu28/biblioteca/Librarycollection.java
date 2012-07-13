package com.twu28.biblioteca;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created with IntelliJ IDEA.
 * User: Prateek
 * Date: 7/13/12
 * Time: 1:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Librarycollection {
    book []Allbooks;

  Librarycollection(int numberofbooks){
      book[] Allbooks = new book[numberofbooks];

  }

  public void showbooks()
  {
      for(int i =0; i<Allbooks.length;i++)
          Allbooks[i].showbookdetails();
  }
}
