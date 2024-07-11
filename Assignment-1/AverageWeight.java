import java.util.Scanner;

public class AverageWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int average = 0;
        for(int i=0;i<10;i++){
            System.out.println("Enter "+(i+1)+" Person Weight: ");
            average+=sc.nextInt();
        }
        System.out.println("Averages Weight of 10 Person is given by"+average/10.0);
        sc.close();
    }
}
