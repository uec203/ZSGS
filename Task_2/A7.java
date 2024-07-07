package Task_2;
/*
7) Evaluate the following expression on paper and on program and understand the
difference
a+=a++ + ++a + –a + a–; when a=28 
*/
public class A7 {
    public static void main(String[] args) {
        int a = 28;
        // a = 28 + (28+30+29+29) = 144
        a += a++ + ++a + --a + a--;
        System.out.println(a);
    }
}
