/*
 * 
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a
 */
public String wordAppend(String[] strings) {
    Map<String,Integer> map = new HashMap<String,Integer>();
    String ans = "";
    for(String s : strings){
      map.put(s,map.getOrDefault(s,0)+1);
      if(map.get(s)%2==0) ans+=s;
    }
    return ans;
  }