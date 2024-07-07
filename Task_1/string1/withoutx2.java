/*
 * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */
public String withoutX2(String str) {
    int f=1;
    if(str.length()>0 && str.charAt(0)=='x'){
      str = str.substring(1);
      f=0;
    }
    if(str.length()>f && str.charAt(f)=='x'){
      char a = str.charAt(0);
      str = str.substring(f+1);
      if(f>0) str=a+str;
    }
    return str;
}
