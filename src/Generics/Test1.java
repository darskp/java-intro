package Generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test1 {

  public static void main(String[] args) {
    ArrayList<String> l = new ArrayList<String>();
    l.add("10");
    l.add("20");
    l.add("Java");
    for (String s : l) {
      System.out.println(s);
    }
    System.out.println("-------------");
    LinkedList<Integer> li = new LinkedList<Integer>();
    li.add(10);
    li.add(23);
    li.add(455);
    for (int s : li) {
      System.out.println(s);
    }
  }
}
