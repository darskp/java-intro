package oops.Packages.public_specifier.publicTest_OutsidePackage;

import oops.Packages.public_specifier.Student;

public class Test {
 public static void main(String[] args) {
    Student s1=new Student("DARSHAN_ANOTHER_PACKAGE_CLASS");
    Student.display_static();
    System.out.println(Student.name_static);
    System.out.println(s1.name);
    System.out.println(s1.age);
    s1.display();
 }   
}
