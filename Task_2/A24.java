package Task_2;
/* 
24) Write a program to make such a pattern like a pyramid with numbers increased by 1.
Eg:  Input : 10
Output:
     1
    2 3
  4 5 6
7 8 9 10
*/
public class A24 {
    public static void main(String[] args) {
        int n = 10;
        int start=1,end=1,line = 0;
        for(int i=1;i<=n;i++){
            if(i==start){
                for(int j=(n/2)-line;j>0;j--){
                    System.out.print(" ");
                }
            }
            System.out.print(i+" ");
            if(i==end){
                System.out.println();
                line++;
                end+=1+line;
                start=i+1;
            }
        }
    }
}
