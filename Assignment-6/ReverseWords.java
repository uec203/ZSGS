import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0,j=0,len=str.length();
        String ans="";
        while(i<len){
            if(str.charAt(i)==' '){
                ans = " "+str.substring(j, i)+ans;
                j=i+1;
            }
            else if(i==len-1){
                ans= str.substring(j, len)+ans;
            }
            i++;
        }
        System.out.println(ans);
        sc.close();
    }
}
