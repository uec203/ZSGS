import java.util.Scanner;

public class RomanLetter{
    public static boolean func(char a,char b){
        if(a=='I') return b=='X'||b=='V';
        if(a=='X') return b=='L'||b=='C';
        if(a=='C') return b=='D'||b=='M';
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RomanLetter: ");
        String roman = sc.next();
        int map[] = new int[26];
        int ans = 0;
        map['I'-'A']=1;
        map['V'-'A']=5;
        map['X'-'A']=10;
        map['L'-'A']=50;
        map['C'-'A']=100;
        map['D'-'A']=500;
        map['M'-'A']=1000;
        
        for(int i=0;i<roman.length();i++){
            char a = roman.charAt(i);
            if(i<roman.length()-1){
                char b = roman.charAt(i+1);
                if(map[a-'A']<map[b-'A'] && func(a,b)){
                    ans+=map[b-'A']-map[a-'A'];
                    i++;
                    continue;
                }
            }
            ans+=map[a-'A'];
        }
        System.out.println("Output:"+ans);
        sc.close();
    }
}