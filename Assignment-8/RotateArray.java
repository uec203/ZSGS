import java.util.Scanner;
/*1. Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user*/
public class RotateArray {
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter K: ");
        int k =sc.nextInt();
        k=k%n;
        reverse(arr,0,arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
