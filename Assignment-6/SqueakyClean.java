class SqueakyClean {
    static String clean(String identifier) {
        String ans = "";
        for(int i=0;i<identifier.length();i++){
            char a = identifier.charAt(i);
            if(a==' ') ans +="_";
            else if(a=='-') ans += Character.toUpperCase(identifier.charAt(++i));
            else if(Character.isDigit(a)){
                if(a=='1') ans+='l';
                else if(a=='3')ans+='e';
                else if(a=='4')ans+='a';
                else if(a=='7') ans+='t';
                else if(a=='0') ans+='o';
            }
            else if(Character.isAlphabetic(a)) ans+=a;
        }
        return ans;
    }
}