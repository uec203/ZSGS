package Task_2;
/*
 * 20) Write a programs to print following patterns
 *       1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
 */
public class A20 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=0;i<n;i++){
            //space
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            //number
            int num = 1;
            for(int j=0;j<=2*i;j++){
                System.out.print(num);
                if(j<i) num++;
                else num--;
            }
            System.out.println();
        }
    }
}
