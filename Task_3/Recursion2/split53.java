/*
 * 
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)


split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true
 */
public boolean split53(int[] nums) {
    return f(0,nums,0,0);
  }
  public boolean f(int start,int[] arr,int grp1,int grp2){
    if(start==arr.length) return grp1==grp2;
    if(arr[start]%5==0) return f(start+1,arr,grp1+arr[start],grp2);
    if(arr[start]%3==0) return f(start+1,arr,grp1,grp2+arr[start]);
    if(f(start+1,arr,grp1+arr[start],grp2)) return true;
    if(f(start+1,arr,grp1,grp2+arr[start])) return true;
    return false;
  }
  