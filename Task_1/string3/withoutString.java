/*
 * 
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */
public String withoutString(String base, String remove) {
    int bLen = base.length(),rLen = remove.length();
    String ans = "";
    for(int i=0;i<bLen;i++){
      if((i<=bLen-rLen) && base.substring(i,i+rLen).toLowerCase().equals(remove.toLowerCase())){
        i+=rLen-1;
      }
      else{
        ans+=""+base.charAt(i);
      }
    }
    return ans;
  }
  