package Collection_Framework.Set_.Hashset_;

import java.util.HashSet;
import java.util.Set;

public class Example1 {

  public static void main(String[] args) {
    Set h = new HashSet();
    h.add(20);
    h.add(20);
    h.add(null);
    System.out.println(h);
    System.out.println(h.size());
    for (Object object : h) {
        System.out.println(object);
    }
  }
}
