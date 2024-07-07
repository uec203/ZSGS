package Task_2;

import java.util.Scanner;

/*
 * 19) Java Program to left rotate the elements of a multidimensional array.

 */
public class A19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            arr[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Before left shift");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            int a = arr[i][0];
            for(int j=0;j<n-1;j++){
               arr[i][j]=arr[i][j+1]; 
            }
            arr[i][n-1]=a;
        }
        System.out.println("After left shift");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        sc.close();
    }
}
