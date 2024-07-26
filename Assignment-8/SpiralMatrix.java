import java.util.Scanner;
/*3. Write a program to generate the matrix with integers in spiral order. Get size N from the user and generate an NxN spiral matrix. */
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt(),c=0;
        int arr[][] = new int[n][n];
        System.out.println("Enter Element : ");
        int rowstart=0,rowend=n-1,colstart=0,colend=n-1;
        while (rowstart<=rowend && colstart<=colend) {
            for(int i=colstart;i<=colend;i++){
                arr[rowstart][i]=++c;
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                arr[i][colend]=++c;
            }
            colend--;
            for(int i=colend;i>=colstart;i--){
                arr[rowend][i]=++c;
            }
            rowend--;
            for(int i=rowend;i>=rowstart;i--){
                arr[i][colstart]=++c;
            }
            colstart++;
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
