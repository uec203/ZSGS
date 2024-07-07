/*
 *
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
public String doubleChar(String str) {
    if(str.length()==0) return str;
    return ""+str.charAt(0)+str.charAt(0)+doubleChar(str.substring(1));
  }
  