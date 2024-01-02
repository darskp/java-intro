package Collection_Framework.Map_;

import java.util.*;

public class LinkedHashMap_ {

  public static void main(String[] args) {
    //main tain the insertion order, no duplication are allowed
    LinkedHashMap<Integer, String> h = new LinkedHashMap<Integer, String>();
    h.put(1, "Darshan");
    h.put(10, "Hello");
    h.put(10, "Hello1");
    System.out.println(h);
    //     Set<Integer> s = lhm.keySet();
    //  for(int key : s) {
    //  System.out.println(key+" --> "+lhm.get(key));

    Set<Integer> s = h.keySet();
    for (int key : s) {
      System.out.println(key);
    }
  }
}
