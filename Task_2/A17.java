package Task_2;

import java.util.Scanner;

/*
17) Alternate sorting: Given an array of integers, rearrange the array in such a way that
the first element is first maximum and second element is first minimum.
 Example:  Input : {1, 2, 3, 4, 5, 6, 7}
Output: {7, 1, 6, 2, 5, 3, 4}
 */
public class A17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt(), max=0;
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
            if(max<arr[i]) max = arr[i];
        }
        int i=0,j=n-1;
        max++;
        for(int k = 0;k<n;k++){
            if(k%2==0){
                arr[k]+=(arr[j--]%max)*max;
            }
            else{
                arr[k]+=(arr[i++]%max)*max;
            }
        }
        System.out.println("output:");
        for( int k : arr){
            System.out.print((k/max)+" ");
        }
    }
}
