import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book{
// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
        int price;
        String title;
        String author;
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    MyBook(String title,String author,int p){
        super(title,author);
        this.title=title;
        this.author=author;
        price=p;
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
// End class
}
public class Solution {