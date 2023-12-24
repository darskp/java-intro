package oops.Constructor_Overloading;

public class employee {

  int id;
  String name;
  double salary;

  employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  void display() {
    System.out.println("Employee Id: " + this.id);
    System.out.println("Employee Name: " + this.name);
    System.out.println("Employee Salary: " + salary);
  }

  public static void main(String[] args) {
    employee e1 = new employee(1, "Darshan", 50000.00);
    employee e2 = new employee(2, "Darshan2", 40000.00);
    e1.display();
    System.out.println("--------------------");
    e2.display();
  }
}
