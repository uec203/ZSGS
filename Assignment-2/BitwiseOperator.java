/*
 * 3. Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.
 */

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        // bitwise and
        System.out.println("a&b = "+(a&b));
        // bitwise or
        System.out.println("a|b = "+(a|b));
        // bitwise xor
        System.out.println("a^b = "+(a^b));
        //Bitwise Left Shift
        System.out.println("Bitwise Left Shift(a<<b): " + (a << b));
        //Bitwise Right Shift
        System.out.println("Bitwise Right Shift(a>>b): " + (a>>b));
        //Bitwise Unsigned Right Shift
        System.out.println("Bitwise Unsigned Right Shift(a>>>b): " + (a >>> b));
        sc.close();
    }
}
