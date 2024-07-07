/*
 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target, with this additional constraint: if there are numbers in the array that are adjacent and the identical value, they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values).


groupSumClump(0, [2, 4, 8], 10) → true
groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
groupSumClump(0, [2, 4, 4, 8], 14) → false
 */
public boolean groupSumClump(int start, int[] nums, int target) {
    if(nums.length==start) return target==0;
    int i=start,sum=nums[i];
    while(i<nums.length-1){
      if(nums[i]==nums[i+1]) sum+=nums[i++];
      else break;
    }
    return groupSumClump(i+1,nums,target-sum) || groupSumClump(i+1,nums,target);
  }