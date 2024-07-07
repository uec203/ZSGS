package Task_2;

import java.util.Scanner;

/*
 * 15) Java Program to print the duplicate elements of an array
 */
public class A15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        System.out.println("The Duplicate Elements are");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=-1){
                    System.out.print(arr[j]+ " ");
                    arr[j]=-1;
                }
            }
        }
        sc.close();
    }
}
