package Task_2;
/*
23) Write a programs to print following patterns
9 9 9 9 9 9 9 9 9 
 8 8 8 8 8 8 8 8  
  7 7 7 7 7 7 7   
   6 6 6 6 6 6    
    5 5 5 5 5     
     4 4 4 4      
      3 3 3       
       2 2        
        1
 */
public class A23 {
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
                System.out.print(n-i+" ");
                else
                System.out.print(" "+(n-i));
            }
            System.out.println();
        }
    }
}
