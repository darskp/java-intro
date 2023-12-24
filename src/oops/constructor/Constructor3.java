package oops.constructor;

public class Constructor3 {
  String name;
  static String name1 = "Hello"; //member variable /global

  Constructor3(String name) {
    System.out.println(name);
    this.name = name; //local
    System.out.println(name);
    this.name = "Darshan this";
    System.out.println(this.name);
    System.out.println(name);
    System.out.println(".................");
    name = "Darshan1";
    System.out.println(name);
    System.out.println(this.name);
    this.name = "Darshan this1";
    System.out.println(this.name);
  }
 
  void display() {
    System.out.println(name);
    System.out.println(name1);
  }

  public static void main(String[] args) {
    System.out.println("START " + Constructor3.name1);
    Constructor3 obj1 = new Constructor3("Darshan");
    obj1.display();
  }
}
