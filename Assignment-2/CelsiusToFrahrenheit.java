/*
 * 1. Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions
 */
import java.util.Scanner;

public class CelsiusToFrahrenheit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius Value : ");
        double celsius = sc.nextDouble();
        double frahrenheit = (celsius*9/5) + 32 ;
        System.out.println("The Frahrenheit Value : "+frahrenheit+"°F");
        sc.close();
    }
}
