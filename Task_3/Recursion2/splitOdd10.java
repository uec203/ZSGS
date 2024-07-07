/*
 * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)


splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true
 */
public boolean splitOdd10(int[] nums) {
    return f(0,nums,0,0);
  }
  public boolean f(int start,int[] arr,int grp1,int grp2){
    if(start==arr.length) return grp1%10==0 && grp2%2==1;
    if(f(start+1,arr,grp1+arr[start],grp2)) return true;
    if(f(start+1,arr,grp1,grp2+arr[start])) return true;
    return false;
  }