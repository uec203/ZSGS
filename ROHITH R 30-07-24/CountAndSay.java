import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        int i=0,count=0;
        while(i<str.length()){
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                count++;
                ans+= count +""+str.charAt(i);
                count=0;
            }
            i++;
        }
        System.out.println(ans);
        sc.close();
    }
}
