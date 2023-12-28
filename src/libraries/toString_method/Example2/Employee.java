package libraries.toString_method.Example2;

public class Employee {
  int id;
  String name;

  Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Employee Id of " + name + " is " + id;
  }

  public static void main(String[] args) {
    Employee e1 = new Employee(101, "A");
    Employee e2 = new Employee(102, "B");
    Employee e3 = new Employee(103, "C");
    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
  }
}
