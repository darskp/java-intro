package Collection_Framework.Map_;

import java.util.HashMap;

public class HashMap_ {

  public static void main(String[] args) {
    HashMap h = new HashMap();
    // put() is used to add key and value inside Map
    h.put(1, "Darshan");
    h.put(10, "Hello");
    h.put("name", "Test");
    System.out.println(h);

    System.out.println("------------");
    // get() is used to get an value based on the key specified
    System.out.println(h.get(1));
    System.out.println(h.get(10));

    System.out.println("---------");

    // containsKey() is used to check if the key is present or not
    System.out.println(h.containsKey("G"));
    System.out.println(h.containsKey(10));

    System.out.println("--------");

    // containsValue() is used to check if the Value is present or not
    System.out.println(h.containsValue("Darshan"));
    System.out.println(h.containsValue("Dinga"));

    System.out.println("-----------");

    // remove() is used to remove an value based on the key specified
    h.remove(10);

    System.out.println(h);

    System.out.println(h.isEmpty());
    h.clear();
    // clear() is used to remove all the objects from the Collection

    System.out.println(h.isEmpty());
  }
}
