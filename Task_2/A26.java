package Task_2;
/*
26) Write a program to print the following pattern for the given input number.
Eg 1:  Input: 4
        Output:
********
***__***
**____**
*______*
**____**
***__***
********
 */
public class A26 {
    public static void main(String[] args) {
        int n = 4,num=0;
        for(int i=1;i<n+n;i++){
            
            for(int j=0;j<n-num;j++){
                System.out.print("*");
            }
            for(int j =0 ;j<2*num;j++){
                System.out.print("_");
            }
            for(int j=0;j<n-num;j++){
                System.out.print("*");
            }
            if(i<n) num++;
            else num--;
            System.out.println();
        }
    }
}
