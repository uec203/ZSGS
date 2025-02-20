/*
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.


countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */
public int countClumps(int[] nums) {
    int i=0,count=0;
    while(i<nums.length){
      int val = nums[i++];
      int len = 1;
      while(i<nums.length && nums[i]==val){
        i++;
        len++;
      }
      if(len>1) count++;
    }
    return count;
  }