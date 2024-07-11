/*2. Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short */
public class TypeConversion {
    public static void main(String[] args) {
        //float to int
        float a = 5.6f;
        int b = (int)a;
        System.out.println("float to int: "+b);
        //double to float
        double c = 100.555;
        float d = (float)c;
        System.out.println("double to float: "+d);
        //int to short
        b=32761;
        short e = (short)b;
        System.out.println("int to short: "+e);
    }
}
