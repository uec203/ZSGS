/*
 * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */
public String fizzString(String str) {
    String ans = "";
    int len=str.length();
    if(len>0 && str.charAt(0)=='f') ans+="Fizz";
    if(len>0 && str.charAt(len-1)=='b') ans+="Buzz";
    if(ans=="") return str;
    return ans;
  }
  