/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

/**
 *
 * @author pavit
 */
public class Books {
    
    private String bookName;
    private String bookStock;
    
    public Books(String bookName, String bookStock){
        this.bookName = bookName;
        this.bookStock = bookStock;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookStock() {
        return bookStock;
    }

    public void setBookStock(String bookStock) {
        this.bookStock = bookStock;
    }
    
}
