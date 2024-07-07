/*
 * 
Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
public int countHi(String str) {
    if(str.length()<=1) return 0;
    if(str.substring(0,2).equals("hi")) return 1 + countHi(str.substring(2));
    return countHi(str.substring(1));
  }
  