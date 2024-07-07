/*
 * 
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */
public boolean hasBad(String str) {
    if(str.length()<=2) return false;
    for(int i=0;i<2 && i+3<=str.length();i++){
      if(str.substring(i,i+3).equals("bad")) return true;
    }
    return false;
  }
  