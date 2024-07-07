/*
 * 
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)


splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
 */
public boolean splitArray(int[] nums) {
    return f(0,nums,0,0);
  }
  public boolean f(int start,int[] arr,int grp1,int grp2){
    if(start==arr.length) return grp1==grp2;
    if(f(start+1,arr,grp1+arr[start],grp2)) return true;
    if(f(start+1,arr,grp1,grp2+arr[start])) return true;
    return false;
  }