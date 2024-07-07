/*
 * 
Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
public boolean more14(int[] nums) {
    int onec =0 ,fourc = 0;
    for(int i : nums){
      if(i==1) onec++;
      else if(i==4) fourc++;
    }
    return onec>fourc;
  }
  