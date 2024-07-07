/*
 * 
Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
 */
public String atFirst(String str) {
    int len = str.length();
    if(len==0) return "@@";
    if(len==1) return str+"@";
    return str.substring(0,2);
  }