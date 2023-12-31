package Collection_Framework.Lists;

import java.util.ArrayList;

public class Example1 {

  public static void main(String[] args) {
    ArrayList l = new ArrayList();
    /* add() is used to add an object into the collection */
    l.add(10);
    l.add(20.34);
    l.add(10);
    l.add("null");
    l.add("java");
    System.out.println(l);
    //toString is overrided                      

    System.out.println(l.size());
    /* size() is used to return the length of the Collection */

    /* get() is used to return an object based on the index position */
    System.out.println(l.get(2));
    // System.out.println(l.get(250));//IndexOutOfBoundException

    /* contains() is used to check if the object is present in the Collection or not */
    System.out.println(l.contains("java"));

    /* remove() is used to remove an object based on the index position */
    System.out.println(l.remove(2));
    System.out.println(l);

    /* isEmpty() is used to check if the Collection is Empty or not */

    System.out.println(l.isEmpty());
    l.clear();
    /* clear() will remove all the Objects from the Collection */
    System.out.println(l.isEmpty());

    ArrayList x = new ArrayList();
    x.add(20);
    x.add(10);
    x.add(10);
    System.out.println("--------");
    /* indexOf() is used to find the index position of an Object
and first occurrence in case of duplication */
    System.out.println(x);
    System.out.println(x.indexOf(10));
    System.out.println(x.indexOf(100)); // -1 if the object is not present

    System.out.println(x.lastIndexOf(10));
  }
}
