package Collection_Framework.Set_.Treeset_;

import java.util.TreeSet;

public class Example1 {

  public static void main(String[] args) {
    TreeSet<Integer> t = new TreeSet<Integer>();
    t.add(10);
    t.add(30);
    t.add(20);
    t.add(10);
    for (Integer integer : t) {
      System.out.println(integer);
    }
  }
}
