package Task_2;
/*
 * 10) Using Recursion, reverse the string such as
Eg 1:  Input: one two three
       Output: three two one
Eg 2:  Input: I love india
       Output: india love I
 */
import java.util.*;
public class A10 {
    public static String reverse(String str){
        int index = str.indexOf(" ");
        if(index==-1) return str;
        return reverse(str.substring(index+1))+" "+str.substring(0, index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
        sc.close();
    }
}
