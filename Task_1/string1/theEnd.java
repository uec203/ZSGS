/*
 * Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */
public String theEnd(String str, boolean front) {
    if(front) return Character.toString(str.charAt(0));
    return Character.toString(str.charAt(str.length()-1));
  }
  