import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,max=Integer.MIN_VALUE;
        System.out.println("Enter Number 1st: ");
        a=sc.nextInt();
        System.out.println("Enter Number 2nd: ");
        b=sc.nextInt();
        System.out.println("Enter Number 3rd: ");
        c=sc.nextInt();
        if(a>b && a>c) max = a;
        else if(b>c) max = b;
        else max = c;
        System.out.println("Greatest Number is : "+max);
    }
}
