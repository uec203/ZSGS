package Task_2;

import java.util.Scanner;

/*
 * 12) Program to Check Whether a Character is an Alphabet or not
 */
public class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if((a>='a' && a<='z') ||(a>='A' && a<='Z')){
            System.out.println("Given Character is an Alphabet :"+a);
        }
        else{
            System.out.println("Given Character is not an Alphabet :");
        }
        sc.close();
    }
}
