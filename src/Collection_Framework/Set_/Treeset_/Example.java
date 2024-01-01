package Collection_Framework.Set_.Treeset_;

import java.util.TreeSet;

public class Example {

  public static void main(String[] args) {
    //homogeneous object into the Tree set and we can't store hetero  - bcz need to compare
    TreeSet<String> t = new TreeSet<String>();
    t.add("AB");
    t.add("ABC");
    t.add("D");
    t.add("P");
    t.add("ABD");
    for (String s: t) {
      System.out.println(s);
    }

    Integer a=10;
    // int b=30; - wont work==> it is a primitive datatype and doesn't have a compareTo method
    Integer b=20;
    System.out.println(a.compareTo(b));
    System.out.println(b.compareTo(a));
    System.out.println(a.compareTo(a));

    

  }
}
