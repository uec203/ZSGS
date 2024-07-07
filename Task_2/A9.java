package Task_2;
/*
 * 9) Write a program to display the number in reverse order without use of String
functions.
Eg 1:  Input: 12345
Output :The number in reverse order is : 54321
 */
import java.util.*;
public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
            ans=(ans*10)+(n%10);
            n/=10;
        }
        System.out.println(ans);
        sc.close();
    }
}
