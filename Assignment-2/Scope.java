/*
 * 4. Write a program with an if statement. Declare one variable inside the if block and another one outside. Print both variables inside and outside the if block to understand variable scope. (Comment the compiler error in your program while submitting)
 */
public class Scope {
    public static void main(String[] args) {
        int a = 10; 
        if(true){
            int b = 10;
            System.out.println("Inside If Block: a="+a+"b="+b);
        }
        //compilation problem since b is not visible
        System.out.println("Outside If Block: a="+a+"b="+b);
    }
}
