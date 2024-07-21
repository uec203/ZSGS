import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0,len=str.length();
        while(i<len){
            str = str.substring(1, len-i) + str.charAt(0) + str.substring(len-i, len);
            i++;
        }
        System.out.println(str);
        sc.close();
    }
} 
