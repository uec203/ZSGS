package Task_2;
/*
 * 21) Write a programs to print following patterns
 *       9       
        989      
       98789     
      9876789    
     987656789   
    98765456789  
   9876543456789 
  987654323456789
 98765432123456789
 */
public class A21 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=0;i<n;i++){
            //space
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            //number
            int num = 9;
            for(int j=0;j<=2*i;j++){
                System.out.print(num);
                if(j<i) num--;
                else num++;
            }
            System.out.println();
        }
    }
}
