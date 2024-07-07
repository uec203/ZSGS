/*
 * 
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */
public String starOut(String str) {
    String ans = "";
    for(int i=0;i<str.length();i++){
      boolean f = true;
      if(i>0 && str.charAt(i-1)=='*') f = false;
      if(i<str.length()-1 && str.charAt(i+1)=='*') f = false;
      if(f && str.charAt(i)!='*') ans+=str.charAt(i);
    }
    return ans;
  }