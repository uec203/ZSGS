/*
 * Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.


plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */
public String plusOut(String str, String word) {
    String ans = "";
    int sLen=str.length(),wLen=word.length();
    for(int i=0;i<sLen;i++){
      if(i<=(sLen-wLen) && str.substring(i,i+wLen).equals(word)){
        ans+=word;
        i+=wLen-1;
      }else{
        ans+="+";
      }
    }
    return ans;
  }