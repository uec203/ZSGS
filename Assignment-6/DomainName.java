import java.util.*;
public class DomainName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String[] parts = str.split("@");
        if(parts.length!=2 || !Character.isAlphabetic(parts[0].charAt(0)) ||
         !Character.isAlphabetic(parts[0].charAt(parts[0].length()-1))|| !Character.isAlphabetic(parts[1].charAt(0))||
         !Character.isAlphabetic(parts[1].charAt(parts[1].length()-1))){
            System.out.println(str +" is not a valid Domain Email Address");
            return;
        }
        int dots = 0;
        for(int i=0;i<parts[1].length();i++){
            char a = parts[1].charAt(i);
            if(a=='.'){
                dots++;
                if(!Character.isAlphabetic(parts[1].charAt(i-1)) || !Character.isAlphabetic(parts[1].charAt(i+1))){
                    System.out.println(str +" is not a valid Domain Email Address");
                    return;
                }
            }
        }
        if(dots==0 || dots>2){
            System.out.println(str +" is not a valid Domain Email Address");
            return;
        }
        System.out.println(str +" is a valid Domain Email Address");
    }
}
