class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int sum=0,digit = 10;
        if(stringToVerify.length()<10) return false;
        for(int i=0;i<stringToVerify.length();i++){
            char a = stringToVerify.charAt(i);
            if(Character.isDigit(a)){
                int  j = Integer.parseInt(""+a);
                sum +=  j * digit;
                digit=digit-1;
            }
            else if(a=='X' && a==stringToVerify.charAt(stringToVerify.length()-1)){
                sum+= 10 * digit--;
            }
            else if(Character.isAlphabetic(a)) return false;
        }
        if(digit!=0) return false;
        return sum%11==0 ;
    }

}

