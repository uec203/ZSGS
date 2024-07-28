/*
 * 
 * 1. Add a constructor to the Book class already created. Write a function to add books using constructors to an array of <Book> objects, and display all the books added.
 * 2. Similiarly, add constructor to the Employee class already created to add and display.
 * 3. Similarly, add a constructor to the Movie class already created to add and display.
 * 
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private double price;
    private static int bookCount = 0;

    Book(String title, String author, String ISBN, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.price = price;
        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getBookCount() {
        return bookCount;
    }
    public void display(){
        System.out.println("Book Details");
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+ISBN);
        System.out.println("Publication Year : "+publicationYear);
        System.out.println("Price : "+price);   
    }

}