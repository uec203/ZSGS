import java.util.*;
public class AlternateSorting{
    static void swap(int i,int j,int arr[]){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int max=0;
        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=(i%2);j<n-i;j+=2){
                if(i%2==0){
                    if(j+2<n && arr[j]<arr[j+2]){
                        swap(j, j+2, arr);
                    }
                }
                else{
                    if(j+2<n && arr[j]>arr[j+2]){
                        swap(j, j+2, arr);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}