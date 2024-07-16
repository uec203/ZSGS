import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Scored Marks(0-100) :");
        int n = sc.nextInt();
        if(n>100 && n<0){
            System.out.println("Invalid input");
        }
        else if(100>=n && n>90){
            System.out.println("The Student has Scored O Grade");
        }
        else if(n>80){
            System.out.println("The Student has Scored A+ Grade");
        }
        else if(n>70){
            System.out.println("The Student has Scored A Grade");
        }
        else if(n>60){
            System.out.println("The Student has Scored B+ Grade");
        }
        else if(n>=50){
            System.out.println("The Student has Scored B Grade");
        }
        else{
            System.out.println("The Student has Scored R Grade");
        }
    }
}
