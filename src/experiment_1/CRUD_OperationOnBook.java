/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_1;
import java.util.*;
/**
 *
 * @author DELL
 */
class Book{
    
    // all instance variables
    private int BookId;
    private String BookName;
    private String AuthorName;
    
    // Constructor for book
    public Book(int id,String name,String author){
       this.BookId = id;
       this.BookName = name;
       this.AuthorName = author;
    }
    
    // Updates the book
    public void updateBook(int id,String name,String author){
       this.BookId = id;
       this.BookName = name;
       this.AuthorName = author;
       System.out.println("Book is updated!");
    }
    
    // displays the book details
    public void displayBook(){
        String book;
        book = "\nBook id: " + this.BookId + 
               "\nBook name: " + this.BookName + 
               "\nAuthor Name: " + this.AuthorName;
        System.out.println(book);
    }
}
public class CRUD_OperationOnBook {
    public static void main(String[] args) {
     // creates a book
     Book book = new Book(5,"Java Programming","James Gosling");
     System.out.println("Book is created!");
     // displays the creayed book details
     book.displayBook();
     // scanner for taking input
     Scanner sc = new Scanner(System.in);
     int bookid;
     String bookname,author;
     // get the input for bookid,bookname and authorname
     System.out.println("Enter new bookid to update: ");
     String input = sc.nextLine();
     bookid = Integer.parseInt(input);
     System.out.println("Enter new book name to update: ");
     bookname = sc.nextLine();
     System.out.println("Enter new author name to update: ");
     author = sc.nextLine();
     // updates the daetails
     book.updateBook(bookid, bookname, author);
     // displays the updated book detaisl
     book.displayBook();
    }  
}
