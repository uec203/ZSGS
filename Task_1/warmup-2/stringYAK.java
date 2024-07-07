/*
 * 
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */
public String stringYak(String str) {
    String ans = "";
    for(int i=0;i<str.length();i++){
      if(i<str.length()-2 && str.substring(i,i+3).equals("yak")) i+=2;
      else ans+=str.charAt(i);
    }
    return ans;
  }