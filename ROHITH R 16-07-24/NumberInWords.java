import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        String lakhs[] ={"lakhs","Thousand","hundred",
        "ninty","eighty","seventy","sixty","fifty","fouty","thirty","twenty"
        ,"nineteen","eightteen","seventeen","sixteen","fifteen","forteen","thirteen","twelve","eleven",
        "ten","nine","eight","seven","six","five","four","three","two","one"}; 
        int[] value = {
            100000,1000,100,
            90,80,70,60,50,40,30,20,
            19,18,17,16,15,14,13,12,11,
            10,9,8,7,6,5,4,3,2,1
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int n = sc.nextInt();
        int m = n;
        String ans = "";
        int i = 0;
        while(n>0 && i<lakhs.length){
            while(n>=value[i]){
                int v = n/value[i];
                int last = v;
                if(v>19){
                    if(v/10>1){
                        ans+=lakhs[lakhs.length-(18+(v/10))]+" ";
                    }
                    v%=10;
                }
                if(n>=100){
                    ans+=lakhs[lakhs.length-v]+" ";
                }

                ans+=lakhs[i]+" ";
                n-=(value[i]*last);
                if((n>0&&n<99) && (value[i]>=100)) ans+="and ";
            }
            i++;
        }
        System.out.println(ans);
    }
}
