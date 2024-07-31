import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: " );
        int n = sc.nextInt();
        int arr[] =  new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target: ");
        int t = sc.nextInt();
        int i=0,j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==t){
                i=mid;
                break;
            }
            else if(arr[mid]>t){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        System.out.println("Output :"+(i));
        sc.close();
    }
}
