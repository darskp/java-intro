package Collection_Framework.LinkedList;

import java.util.*;

public class Test2 {

  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    LinkedList nl = new LinkedList();
    nl.add(50);
    nl.add(10);
    nl.addAll(l);
    System.out.println(nl.containsAll(l));

    // containsAll() is used to check if all the objects of one collection is present
    //  inside another collection or not.

    nl.removeAll(l);
    System.out.println(l);
    System.out.println(nl);
    // removeAll() is used to remove all the objects of one collection from another collection
    //even it will remove the duplicates

    l.add(1, 10);
    // add() is used to add an object based on the index position
    // already existing object gets shifted to the next position
    System.out.println(l);

    // set() is used to add an object based on the index position
    // already existing object gets overridden
    l.set(2, 90);
    System.out.println(l);
  }
}
