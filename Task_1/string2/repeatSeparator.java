/*
 * 
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */
public String repeatSeparator(String word, String sep, int count) {
    if(count==0) return "";
    String ans = word;
    while(count>1){
      ans+=sep+word;
      count--;
    }
    return ans;
  }