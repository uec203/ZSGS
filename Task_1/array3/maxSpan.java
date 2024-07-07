/*
 * 
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)


maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */
public int maxSpan(int[] nums) {
    int max = 0,n=nums.length;
    for(int i=0;i<n;i++){
      for(int j=n-1;j>=i;j--){
        if(nums[i]==nums[j]){
          if(max<j-i+1) max = j-i+1;
        }
      }
    }
    return max;
}