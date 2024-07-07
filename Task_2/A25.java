package Task_2;
/*
 * 
25) Write a program to print the following output for the given input. You can assume
the string is of odd length
Eg 1:  Input: 12345
        Output:
1       5
  2   4
    3
  2   4
1        5
 */
public class A25 {
    public static void main(String[] args) {
        String s = "12345";
        int n = s.length();
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i==n-j-1) System.out.print(s.charAt(j));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
