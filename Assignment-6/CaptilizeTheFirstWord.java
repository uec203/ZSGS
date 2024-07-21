import java.util.Scanner;

public class CaptilizeTheFirstWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0,len=str.length();
        while(i<len){
            if(i==0){
                str=str.substring(0,1).toUpperCase()+str.substring(i+1);
            }
            else if(str.charAt(i)==' ' && i+1<len){
                str=str.substring(0,i+1)+str.substring(i+1,i+2).toUpperCase()+str.substring(i+2);
            }
            i++;
        }
        System.out.println(str);
        sc.close();
    }
}
