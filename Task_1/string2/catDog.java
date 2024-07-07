/*
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */
public boolean catDog(String str) {
    int l = 0,r = 0;
    for(int i=0;i<str.length()-2;i++){
      if(str.substring(i,i+3).equals("cat")){
        l++;
        i+=2;
      }
      else if(str.substring(i,i+3).equals("dog")){
        r++;
        i+=2;
      }
    }
    return l==r;
  }
  