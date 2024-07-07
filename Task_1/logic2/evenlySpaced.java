/*
 * 
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */
public boolean evenlySpaced(int a, int b, int c) {
    if(a<b){
      int d = a;
      a=b;
      b=d;
    }
    if(a<c){
      int d = a;
      a=c;
      c=d;
    }
    if(b<c){
      int d = b;
      b=c;
      c=d;
    }
    return a-b == b-c;
  }