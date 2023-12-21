package oops.classIntro;

public class Employee {

  String empID = "E1";
  int age = 26;
  String Department = "IT";
}

class Test {

  public static void main(String[] args) {
    Employee emp1 = new Employee();
    System.out.println(
      "Employee info ==> " +
      "ID: " +
      emp1.empID +
      ", Age: " +
      emp1.age +
      ", Department: " +
      emp1.Department
    );

    Student stu1=new Student();
     System.out.println(
      "Student info ==> " +
      "Name: " +
      stu1.name +
      ", Age: " +
      stu1.age
    );
  }
}
