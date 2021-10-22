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
public class Book {
   public String title;
    public String author;
     
    Book(String title, String author)
    {
         
        this.title = title;
        this.author = author;
    }
}
 
// Library class contains
// list of books.
class Library
{
 
    // reference to refer to list of books.
    private final List<Book> books;
     
    Library (List<Book> books)
    {
        this.books = books;
    }
     
    public List<Book> getTotalBooksInLibrary(){
         
       return books; 
    } 
}
