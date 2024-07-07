package Task_2;

import java.util.Scanner;

/*
 * 13) Java Program to print the smallest element in an array
 */
public class A13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        int min = arr[0];
        for(int i:arr){
            if(min>i) min = i;
        }
        System.out.println("The Smallest Element in the given array is "+min);
        sc.close();
    }
}
