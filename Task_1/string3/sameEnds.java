/*
 * Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */
public String sameEnds(String string) {
    String ans = "",temp = "";
    for(int i=0;i<string.length()/2;i++){
      temp+=""+string.charAt(i);
      if(temp.equals(string.substring(string.length()-temp.length(),string.length()))) ans = temp;
    }
    return ans;
  }
  