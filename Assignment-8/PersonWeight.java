import java.util.Scanner;
/*4. Initialize a jagged array with N rows with weights of N persons.
 Each person can have different number of weights. 
 Write 
      a. A function to enter the weight of any user at any time. 
      b. A function to calculate the minimum weight of the nth person. */
public class PersonWeight {
    static void findPersonWeight(int n,int[][] arr){
        System.out.println((n+1)+"th Person weights is : ");
        for(int i=0;i<arr[n].length;i++){
            System.out.print(arr[n][i]+" ");
        }
    }
    static void findPersonMinimumWeight(int n,int[][] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr[n].length;i++){
            min= min<arr[n][i]?min:arr[n][i];
        }
        System.out.println((n+1)+"th Person weights is : "+min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Persons : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"th Person weights count : ");
            int m = sc.nextInt();
            arr[i]=new int[m];
            System.out.println("Enter "+(i+1)+"th Person weights : ");
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter N to find Nth Person weight : ");
        int k = sc.nextInt();
        findPersonWeight(k-1, arr);
        System.out.println();
        System.out.println("Enter N to find Nth Person Minimum weight : ");
        k = sc.nextInt();
        findPersonMinimumWeight(k-1, arr);
        sc.close();
    }
}
