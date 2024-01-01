package Collection_Framework.Set_.Treeset_.CustomSorting;

public class Employee {

  int id;
  String name;
  Double salary;

  Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public String toString() {
    return "Employee data ==>" + id + " " + name + " " + salary;
  }
}
