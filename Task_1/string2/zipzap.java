/*
 * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */
public String zipZap(String str) {
    String ans="";
    for(int i=0;i<str.length();i++){
      if(i<str.length()-2 && str.charAt(i)=='z'&&str.charAt(i+2)=='p'){
        ans+=""+str.charAt(i)+str.charAt(i+2);
        i+=2;
      }
      else{
        ans+=str.charAt(i);
      }
    }
    return ans;
  }
  