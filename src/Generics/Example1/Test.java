package Generics.Example1;

import java.util.ArrayList;

public class Test {

  public static void main(String[] args) {
    Employee e1 = new Employee("Darshan1", 20);
    Employee e2 = new Employee("Darshan2", 22);
    Employee e3 = new Employee("Darshan3", 23);

    ArrayList<Employee> al = new ArrayList<Employee>();
    al.add(e1);
    al.add(e2);
    al.add(e3);

    for (Employee emp : al) {
      System.out.println(emp.age);
    }
  }
}
