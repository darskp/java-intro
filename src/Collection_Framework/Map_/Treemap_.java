package Collection_Framework.Map_;

import java.util.*;

public class Treemap_ {

  public static void main(String[] args) {

    //key sorting order

    TreeMap<String,Integer> t = new TreeMap<String, Integer>();

    t.put("Mango", 23);
    t.put("Apple", 20);
    t.put("Banana", 15);
    System.out.println(t);

    Set<String> s = t.keySet();

    for (String key : s) {
      System.out.println("Cost of 1Kg " + key + " is " + t.get(key));
    }
  }
}
