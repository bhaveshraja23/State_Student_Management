/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Books;
import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class BooksDirectory {
    
     private ArrayList<Books> booksList;
    
    public BooksDirectory(){
        booksList = new ArrayList();
    }
    
    public ArrayList<Books> getBooksList() {
        return booksList;
    } 
    
     public Books addBook(Books books) {

        booksList.add(books);
        return books;

    }
}
