package Task_2;
//5) Write a program to evaluate the polynomial equation
import java.util.*;
public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For a polynomial equation : ax^2+bx+c=0");
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        int d = b*b - 4*a*c;
        double x1 = (-b-Math.sqrt(d))/(2*a);
        double x2 = (-b+Math.sqrt(d))/(2*a);
        // x^2+x-6=0 ; x1 = -3.0 && x2 = 2.0
        System.out.print("Solution:\n x1 = "+x1+"\n x2 = "+x2);
        sc.close();
    }
}
