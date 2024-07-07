/*
 * 
Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.


square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
 */
public List<Integer> square56(List<Integer> nums) {
    return nums.stream().map(x->x*x+10).filter(x->x%10!=5&&x%10!=6).collect(Collectors.toList());
  }
  