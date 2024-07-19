/*
 * 1. Create a Java class MathOperations with methods for basic mathematical operations such as add() , subtract() , multiply() , and divide() .
 *  Implement method overloading to allow these operations for integers, doubles, and optionally, other types.
 */
public class MathOperations{
    public static void main(String[] args) {
        int a = add(1, 5);
        float b = add(1.1f,2.2f);
        double c = add(1.35,1.55);
        System.out.println(a+" "+b+" "+c);
    }
    //Integer
    public static int add(int a,int b){
        return a+b;
    }
    public static int subtract(int a,int b){
        return a-b;
    }
    public static int multiply(int a ,int b){
        return a*b;
    }
    public static int divide(int a,int b){
        return a/b;
    }
    //Float
    public static float add(float a,float b){
        return a+b;
    }
    public static float subtract(float a,float b){
        return a-b;
    }
    public static float multiply(float a ,float b){
        return a*b;
    }
    public static float divide(float a,float b){
        return a/b;
    }
    //Double
    public static double add(double a,double b){
        return a+b;
    }
    public static double subtract(double a,double b){
        return a-b;
    }
    public static double multiply(double a ,double b){
        return a*b;
    }
    public static double divide(double a,double b){
        return a/b;
    }
}