package Task_2;

import java.util.Scanner;

/*
16) Given two sorted arrays, merge them such that the elements are not repeated
Example 1:
Input: Array 1: 2,4,5,6,7,9,10,13
         Array 2: 2,3,4,5,6,7,8,9,11,15
Output: Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
 */
public class A16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Enter 2nd array size:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter Elements:");
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt(); 
        }
        int arr2[] = new int[n+n1];
        int i=0,j=0,n2 = 0;
        while(i<arr.length && j<arr1.length){
            if(arr[i]==arr1[j]){
                i++;
            }
            else if(arr[i]<arr1[j]){
                arr2[n2++]=arr[i++];
            }
            else{
                arr2[n2++]=arr1[j++];
            }
        }
        while(i<arr.length) arr2[n2++]=arr[i++];
        while(j<arr1.length) arr2[n2++]=arr1[j++];
        System.out.println("Merged Array:");
        for(i=0;i<n2;i++){
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
}
