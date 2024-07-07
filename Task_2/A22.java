package Task_2;
/*
22) Write a programs to print following patterns
* * * * * * * * * 
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * * 
       * *
        * 
 */
public class A22 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<(i/2)*2;j++){
                System.out.print(" ");
            }
            //number
            for(int j=0;j<n-i;j++){
                if(i%2==0)
                System.out.print("* ");
                else
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
