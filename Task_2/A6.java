package Task_2;
/*
6) Evaluate the following expression on paper and on program and understand the
difference
i)++a-b–-                   ii)a%b++     iii)a*=b+5               iv)x=69>>>2
 */
public class A6 {
    public static void main(String[] args) {
        int a = 3 ,b = 3;
        //4 - 3
        int ans = ++a-b--;
        System.out.println(ans);
        a=5;
        b=3;
        // 5 % 3 = 2
        ans = a%b++;
        System.out.println(ans);
        a=5;
        b=3;
        // a = 5 * (3+5)
        a*=b+5;
        System.out.println(a);
        //69>>>2 = 1000101 >>> 2 = 0010001 = 17; 
        int x = 69>>>2;
        System.out.println(x);
    }
}
