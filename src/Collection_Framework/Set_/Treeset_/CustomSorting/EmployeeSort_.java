package Collection_Framework.Set_.Treeset_.CustomSorting;

import java.util.TreeSet;

public class EmployeeSort_ {

  public static void main(String[] args) {
    TreeSet<Employee> t = new TreeSet<Employee>(new sortingSal());
    // TreeSet<Employee> t = new TreeSet<Employee>(new sortingName());
    t.add(new Employee(1, "Darshan", 12.12));
    t.add(new Employee(2, "Darshan1", 12.1));
    t.add(new Employee(3, "Darshan2", 12.1));
    for (Employee employee : t) {
      System.out.println(employee);
    }
  }
}
