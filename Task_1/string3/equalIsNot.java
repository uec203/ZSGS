/*
 * 
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */
public boolean equalIsNot(String str) {
    int l=0,r=0;
    for(int i=0;i<str.length()-1;i++){
      if(i<str.length()-2 && str.substring(i,i+3).equals("not")){
        l++;
      }
      else if(str.substring(i,i+2).equals("is")){
        r++;
      }
    }
    return l==r;
  }
  