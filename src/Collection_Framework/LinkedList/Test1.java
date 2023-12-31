package Collection_Framework.LinkedList;

import java.util.LinkedList;

public class Test1 {

  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    System.out.println(l);

    for (int i = 0; i < l.size(); i++) {
      System.out.println(l.get(i));
    }

    LinkedList nl = new LinkedList();
    nl.add(10);
    nl.add(80);
    System.out.println(nl.size());
    System.out.println(nl);
    nl.addAll(l);
    
    //  addAll() is used to add all the objects of one collection into another collection. 
    
    System.out.println(nl.size());
    System.out.println(nl);



  }
}
