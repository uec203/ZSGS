package Task_2;

import java.util.Scanner;

/*
 * 30) Given a N*N square matrix, return an array of its anti-diagonals. Look at the example for more
details.
Example
Input:
1 2 3
4 5 6
7 8 9
Output : [
[1],
[2, 4],
[3, 5, 7],
[6, 8],
[9]
]
Input :
1 2
3 4
Output :
[ [1],
[2, 3],
[4]
]
 */
public class A30 {
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
        System.out.println("Given input :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("Output: ");
        for(int i=0;i<n;i++){
            int startcol=i,startrow=0;
            while(startcol>=0 && startrow<n){
                System.out.print(arr[startrow++][startcol--]+" ");
            } 
            System.out.println();
        }
        for(int row=1;row<n;row++){
            int startcol=n-1,startrow=row;
            while(startcol>=0 && startrow<n){
                System.out.print(arr[startrow++][startcol--]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
