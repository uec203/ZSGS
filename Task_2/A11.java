package Task_2;

import java.util.Scanner;

/*
11) Write a program to give the following output for the given input:
Eg 1:  Input: a1b10
Output: abbbbbbbbbb
Eg: 2:  Input: b3c6d15
           Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.

 */
public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),ans="",temp="";
        char a = 'a';
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                a=s.charAt(i);
            }
            else if(i<s.length()-1 && Character.isDigit(s.charAt(i+1))){
                temp+=s.charAt(i);
            }
            else{
                temp+=s.charAt(i);
                int n = Integer.parseInt(temp);
                temp = "";
                while(n>0){
                    ans+=a;
                    n--;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
