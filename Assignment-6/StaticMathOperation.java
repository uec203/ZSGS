/*
 * 2. Write a program to calculate Math operations with Math contents initialized in static block.
 */
public class StaticMathOperation {
    static int a;
    static int b;
    static{
        a=10;
        b=5;
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("Add :"+add(a, b));
        System.out.println("Sub :"+sub(a, b));
        System.out.println("Mul :"+mul(a, b));
        System.out.println("div :"+div(a, b));
    }
}
