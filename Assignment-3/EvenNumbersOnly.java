import java.util.Scanner;

public class EvenNumbersOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i%2!=0) continue;
            sum+=arr[i];
        }
        System.out.println("The Even Numbers Sum is Given by "+sum);
    }
}
