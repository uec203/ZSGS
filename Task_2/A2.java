package Task_2;
/*
 2) Write a program to define the functionality of a Bitwise operators.
 */
public class A2 {
    public static void main(String[] args) {
        //Initial values
        int a = 0;
        int b = 1;
        // bitwise and
        // 0 & 1 = 0
        System.out.println("a&b = "+(a&b));
        // bitwise or
        // 0 | 1 = 1
        System.out.println("a|b = "+(a|b));
        // bitwise xor
        // 0 ^ 1 = 1 
        System.out.println("a^b = "+(a^b));
        // bitwise not
        // will give 2's complement (32 bit) of 1 = -2
        System.out.println("~b = "+~b);
        //Bitwise Left Shift
        //b = 001 << 2 = 100 = 4
        System.out.println("Bitwise Left Shift: " + (b << 2));
        //Bitwise Right Shift
        //5 = 101 >> 2 = 1
        System.out.println("Bitwise Right Shift: " + (5 >> 2));
        //Bitwise Unsigned Right Shift
        //-5 >>> 2 = 1073741822
        System.out.println("Bitwise Unsigned Right Shift: " + (-5 >>> 2));
    }
}
