/*
 * 
Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.


sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
 */
public int sum2(int[] nums) {
    int sum = 0;
    for(int i=0;i<2 && i<nums.length;i++) sum+=nums[i];
    return sum;
  }
  