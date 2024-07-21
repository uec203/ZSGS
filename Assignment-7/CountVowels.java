import java.util.Scanner;
/*
 * 1. Create a program to count vowels in a given string using string functions
 */
public class CountVowels {
    public static boolean isVowel(char a){
        return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
    }
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))) count++;
        }
        System.out.println("Vowel Count: "+count);
        sc.close();
    }
}
