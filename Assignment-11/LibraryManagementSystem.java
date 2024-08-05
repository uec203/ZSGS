import java.lang.reflect.Array;
import java.util.ArrayList;

public class LibraryManagementSystem {
    private String userType;
    private String userName;
    private String password;

    private ArrayList<User> userList;
    private ArrayList<Book> bookList;
    private Librarian librarian;
    
    public void login(){
        //login implementation
    }
    public void  register(){
        //Register implementation
    }
    public void  logout(){
        //logout implementation
    }


}
class User {
    private String name;
    private int id;
    private Account account;
    private ArrayList<Book> ownBooks;

    public void verify(){
        //Verify implementation
    }
    public void  checkAccount(){
        // CheckAccount implementation
    }
    public void  getBookInfo(){
        // get_book_info implementation
    }

}
class Librarian {
    private String name;
    private int id;
    private String password;
    private String searchString;  
    
    private LibraryDatabase data;
    private ArrayList<Book> ownBooks;

    public void verifyLibrarian(){
        //Verify_librarian implemention
    }
    public void search(){
        //Search implemention
    }
}
class  Book {
    private String title;
    private String author;
    private int ISBN;
    private String publication;

    private ArrayList<User> userList;

    public void showDueDt(){
        //Show_duedt implemention
    }
    public void reservationStatus(){
        //Reservation_status implemention
    }
    public void feedBack(){
        //Feedback implemention
    }
    public void bookRequest(){
        //Book_request implemention
    }
    public void RenewInfo(){
        //Renew_info implemention
    }
}
class Account{
    private int noBorrowedBooks;
    private int noReservedBooks;
    private int noReturnedBooks;
    private int noLostBooks;
    private int fineAmount;

    public void calculateFine(){
        //Calculate_fine implemention
    }
    
}
class LibraryDatabase{
    ArrayList<Book> listOfBooks;
    ArrayList<Account> accounts;
    public void add(){
        //Add implemention
    }
    public void delete(){
        //Delete implemention
    }
    public void update(){
        //Update implemention
    }
    public void display(){
        //Display implemention
    }
    public void search(){
        //Search implemention
    }


}
class Staff extends User{
    private String dept;
}
class Student extends User{
    private String classOfStudent;
}