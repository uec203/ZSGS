/*
 * 
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 */
public boolean canBalance(int[] nums) {
    int sum = 0,s=0;
    for(int i=0;i<nums.length;i++) sum+=nums[i];
    for(int i=0;i<nums.length;i++){
      s+=nums[i];
      sum-=nums[i];
      if(s==sum) return true;
    }
    return false;
  }
  