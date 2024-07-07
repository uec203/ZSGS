package Task_2;

import java.util.Scanner;
/*
 * 14) Java Program to copy all elements of one array into another array
 */
public class A14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        int[] arr1  = new int[arr.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }
        System.out.println("The Copied Elements are");
        for(int i:arr1) System.out.print(i+" ");
        sc.close();
    }
}
