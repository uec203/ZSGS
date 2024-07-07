package Task_2;

import java.util.Scanner;

/*
 * 27) Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1.
Eg 1: Input: String 1: test123string
          String 2: 123
         Output: 4
Eg 2:  Input: String 1: testing12
         String 2: 1234
         Output: -1
 */
public class A27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1:");
        String str = sc.next();
        System.out.println("Enter String2:");
        String s = sc.next();
        for(int i=0;i<=str.length()-s.length();i++){
            if(str.substring(i,i+s.length()).equals(s)){
                System.out.println("Output:"+i);
                return;
            }
        }
        System.out.println("Output: -1");
        sc.close();
        return;
    }
}
