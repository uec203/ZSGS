/*
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public String stringTimes(String str, int n) {
    String ans="";
    while(n>0){
      ans+=str;
      n--;
    }
    return ans;
  }
  