/*
 * 
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 */
public int[] frontPiece(int[] nums) {
    int ans[];
    if(nums.length<2) ans = new int[nums.length];
    else ans = new int[2];
    if(ans.length>0) ans[0]= nums[0];
    if(ans.length>1) ans[1]= nums[1];
    return ans;
  }
  