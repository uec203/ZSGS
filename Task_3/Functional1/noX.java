/*
 * Given a list of strings, return a list where each string has all its "x" removed.


noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
 */
public List<String> noX(List<String> strings) {
    strings.replaceAll(x->x.replaceAll("x",""));
    return strings;
  }
  