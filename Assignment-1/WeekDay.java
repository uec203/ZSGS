import java.util.Scanner;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY 
}
public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a WeekDay Number: ");
        int n = sc.nextInt();
        n=n%7;
        if(n<0) n = 0;
        for(Day day:Day.values()){
            if(day.ordinal()==n){
                System.out.println(day);
                break;
            }
        }
        sc.close();
    }
}