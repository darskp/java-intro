package oops.Constructor_Overloading;

public class Constructor_chaining {

  Constructor_chaining(int age) {
    this("Tom");
    System.out.println("Age: " + age);
  }

  Constructor_chaining(double height) {
    this(22);
    System.out.println("Height: " + height);
  }

  Constructor_chaining(String name) {
    System.out.println("Name: " + name);
  }

  public static void main(String[] args) {
    System.out.println("START");
    Constructor_chaining obj1 = new Constructor_chaining(12.2);
    System.out.println("END");
  }
}


//Name: Tom
// Age :22
//Height : 12.2