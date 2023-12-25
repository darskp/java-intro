package oops.Packages.protected_specifier.Test;

public class Student {

  protected String name = "Darshan";
  protected static String name_static = "Darshan_static";
  protected int age=20;

  protected static void display_static() {
    System.out.println();
    System.out.println("I am inside the static method " + name_static);
    System.out.println();
  }

  protected Student(String name) {
    System.out.println();
    System.out.println("START-CONSTRUCTOR..............");
    System.out.println(name);
    this.name = name;
    System.out.println(name_static);
    System.out.println(name);
    System.out.println("END-CONSTRUCTOR..............");
    System.out.println();
  }

  protected Student(){
  System.out.println("No arguments");
  }

  protected void display() {
    System.out.println();
    System.out.println("-----------START-INSIDE OBJ DISPLAY----------");
    System.out.println(this.name);
    System.out.println(name_static);
    System.out.println(name);
    System.out.println("-----------END-INSIDE OBJ DISPLAY----------");
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println(Student.name_static);
    Student.display_static();
    Student s1 = new Student("Darshan_obj");
    s1.display();
  }
}
