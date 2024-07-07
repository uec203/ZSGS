/*
 * 
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */
public String lastTwo(String str) {
    int len = str.length();
    if(len<2) return str;
    return str.substring(0,len-2)+str.charAt(len-1)+str.charAt(len-2);
  }
  