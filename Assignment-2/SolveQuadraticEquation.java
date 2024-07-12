/*
 * 2. Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.
 */
import java.util.Scanner;

public class SolveQuadraticEquation {
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
        if(a==0 && b!=0){
            double x1 = c/b;
            System.out.print("Solution:\n x1 = "+x1);
        }
        else if(d>=0){
            double x1 = (-b-Math.sqrt(d))/(2*a);
            double x2 = (-b+Math.sqrt(d))/(2*a);
            // x^2+x-6=0 ; x1 = -3.0 && x2 = 2.0
            System.out.print("Solution:\n x1 = "+x1+"\n x2 = "+x2);
        }
        else{
            double x1 = (-b)/(2*a);
            double x2 = (-b)/(2*a);
            // x^2+4x-5=0 ; x1 = -2.0+1.0i && x2 = -2.0-1.0i
            System.out.print("Solution:\n x1 = "+x1+" + "+ Math.sqrt(-d)/(2*a) +"i\n x2 = "+x2+" - "+ Math.sqrt(-d)/(2*a) +"i");
        }
        sc.close();
    }
}
