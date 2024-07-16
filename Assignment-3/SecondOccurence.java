import java.util.Scanner;

public class SecondOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int find = -1,count=0;
        System.out.println("Enter Element to find :");
        int num = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                count++;
                if(count==2) {
                    find = i;
                    break;
                }
            }
        }
        if(find==-1) System.out.println("Not Found");
        else System.out.println("The Second Occurance is found at "+find);
    }
}
