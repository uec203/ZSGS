/*
Given a list of strings, return a list of the strings, omitting any string length 3 or 4.


no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]
 */
public List<String> no34(List<String> strings) {
    strings.removeIf(x->x.length()==3||x.length()==4);
    return strings;
  }