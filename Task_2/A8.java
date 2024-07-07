package Task_2;
/*
8) Program to Find ASCII Value of a Character
 */
import java.util.*;
public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        System.out.println("ASCII Value of a "+a+" is "+(int)a);
        sc.close();
    }
}
