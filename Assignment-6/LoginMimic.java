/*
 * 1. Write a java program to mimic login of a person (Get username and password from the user and authenticate). The username and password should be hardcoded in a static block.
 */
import java.util.*;
public class LoginMimic {
    static String personName;
    static String password;
    static{
        personName="Jack";
        password="password";
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String userName = sc.next();
        System.out.println("Password : ");
        String userPassword = sc.next();
        if(userName.equals(personName) && password.equals(userPassword)){
            System.out.println("Login successfull");
        }
        else{
            System.out.println("Login not successfull Please Enter Correct username and password");
        }
        sc.close();

    }
}
