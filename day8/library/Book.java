package library;

public class Book 
{
    String author;
    String title;
    int price;

    public Book(String author, String title, int price)
    {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
