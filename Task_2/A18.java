package Task_2;

import java.util.Scanner;

/*
 * 18) Write a program to sort the elements in odd positions in descending order and
elements in ascending order.
Eg 1:  Input:  13,2 4,15,12,10,5
         Output: 13,2,12,10,5,15,4
Eg 2:  Input: 1,2,3,4,5,6,7,8,9
         Output: 9,2,7,4,5,6,3,8,1
 */
public class A18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        for(int i=0;i<n;i++){
            for(int j=i+2;j<n;j+=2){
                if(i%2==0){
                    if(arr[i]<arr[j]){
                        int a = arr[i];
                        arr[i]=arr[j];
                        arr[j]=a;
                    }
                }
                else{
                    if(arr[i]>arr[j]){
                        int a = arr[i];
                        arr[i]=arr[j];
                        arr[j]=a;
                    }
                }
            }
        }
        System.out.println("output:");
        for(int i : arr) System.out.print(i +" ");
        sc.close();
    }
}
