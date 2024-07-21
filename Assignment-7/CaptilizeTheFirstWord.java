import java.util.Scanner;
/*1. Create a program to count vowels in a given string using string functions
2. Write a program to reverse the characters of a string.
3. Write a program to reverse the words in a sentence.
4. Write a program to validate email address (contains @ and proper domain format). Note: Don't use regular expressions
5. Write a program to capitalize the first letter of each words in a sentence.
6. https://exercism.org/tracks/java/exercises/squeaky-clean
*/
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
