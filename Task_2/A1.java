package Task_2;

/*
1) Write a program to print a letters from the user input character to 'Z' without using
strings.
Example 1:  input : X
Output : XYZ
Example 2:  Input : M
Output : MNOPQRSTUWXYZ
 */
import java.util.*;
class A1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        for(int i=a;i<='Z';i++){
            System.out.print((char)i);
        }
        sc.close();
    }
}