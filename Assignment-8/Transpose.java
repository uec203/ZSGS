import java.util.Scanner;
/*2. Write a program to find transpose of a matrix */
public class Transpose {
    public static void swap(int[][] arr,int i,int j){
        int t = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter Element : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(arr,i,j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
