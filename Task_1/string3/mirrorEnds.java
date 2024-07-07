/*
 * 
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".


mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */
public String mirrorEnds(String string) {
    String ans = "",temp = "";
    for(int i=string.length()-1;i>=0;i--){
      temp+=string.charAt(i);
      if(temp.equals(string.substring(0,temp.length()))) ans = temp;
    }
    return ans;
  }