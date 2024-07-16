import java.util.*;
public class ChildParent {
    public static void main(String[] args) {
        String relationArray[][] = {
            {"Parri","Karikalan"},
            {"Udhiran","Sendhan"},
            {"Sendhan","Arulmozhi"},
            {"Karikalan","Sendhan"}
        };
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int ans = 0;
        ArrayList<String> child = new ArrayList<String>();
        for(int i =0;i<relationArray.length;i++){
            if(name.equals(relationArray[i][1])) {
                child.add(relationArray[i][0]);
            }
        }
        for(String parent : child){
            for(int i =0;i<relationArray.length;i++){
                if(parent.equals(relationArray[i][1])) {
                    ans++;
                }
            }
        }
        System.out.print(ans);
    }
}
