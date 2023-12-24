package oops.Constructor_Overloading;

public class Constructor_chaining2 {

  Constructor_chaining2(int x) {
    this(10.0);
    System.out.println("I am super class constructor value: " + x);
  }

  Constructor_chaining2(double y) {
    System.out.println("I am super class inside double " + y);
  }

  public static void main(String[] args) {}
}
