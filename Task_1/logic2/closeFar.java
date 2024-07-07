/*
 * 
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 */
public boolean closeFar(int a, int b, int c) {
    return ((close(a,b) && far(a,b,c))||(close(a,c) && far(a,c,b)));
  }
  public boolean close(int a,int b){
    return Math.abs(a-b)<=1;
  }
  public boolean far(int a,int b,int c){
    return Math.abs(a-c)>=2 && Math.abs(b-c)>=2;
  }