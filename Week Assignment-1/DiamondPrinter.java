import java.util.*;

class DiamondPrinter {

    List<String> printToList(char a) {
        char print = 'A';
        int b = a - 'A' + 1;
        b=2*b-1;
        int x = b/2 ;
        int y = b/2 ;
        boolean f = true;
        List<String> l = new ArrayList<String>();
        for(int i=0;i<b;i++){
            String ans = "";
            for(int j=0;j<b;j++){
                if(j==x || j==y){
                    ans+=print;
                }
                else
                    ans+=" ";
            }
            l.add(ans);
            if(print<a && f){
                print++;
                x--;
                y++;
            }
            else{
                f=false;
                print--;
                x++;
                y--;
            }
        }
        return l;
    }

}
