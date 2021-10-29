/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author LIA
 */
import java.io.*;
import java.util.*;

public class main {
    public static void main (String[] args){  
        Book b1 = new Book("Dilan", "Pidi Baiq");
        Book b2 = new Book("Bumi", "Tere Liye");
        Book b3 = new Book("Dia Tanpa Aku", "Esti Kinasih"); 
        
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
         
        Library library = new Library(books);
         
        List<Book> bks = library.getTotalBooksInLibrary();
        for(Book bk : bks){
             
            System.out.println("Title : " + bk.title + " and "
            +" Author : " + bk.author);
        }
    }
}
