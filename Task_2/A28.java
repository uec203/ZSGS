package Task_2;

import java.util.Scanner;

/*
28) Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
1111 +.. n terms.
Eg 1: Input:  Input the number of terms : 5
Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
Eg 2: Input:  Input the number of terms : 3
Output :
1 + 11 + 111
The Sum is : 123
 */
public class A28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of terms: ");
        int n = sc.nextInt(),sum=0;
        String ans = "";
        for(int i=1;i<=n;i++){
            String temp = "";
            for(int j=0;j<i;j++){
                temp+='1';
            }
            ans+=temp;
            sum+=Integer.parseInt(temp);
            if(i!=n) ans+=" + ";
        }
        System.out.println("Output: "+ans);
        System.out.println("The sum is "+sum);
        sc.close();
    }
}
