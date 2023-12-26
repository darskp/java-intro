//instanceof operator - used to avoid ClassCastException

// check if an object is an instance of a specific class type or not

package oops.Casting.instanceofoperator.Ex1;

public class Test {

  public static void main(String[] args) {
    //upcasting
    Father fs = new Son();
    System.out.println(fs instanceof Son); //t
    System.out.println(fs instanceof Father); //t
    Father fd = new Daughter();
    System.out.println(fd instanceof Son); //f
    System.out.println(fd instanceof Daughter); //t
    System.out.println(fd instanceof Father); //t

    //downcasting
    Son s1 = (Son) fs;
    System.out.println(s1 instanceof Son); //t
    System.out.println(s1 instanceof Father); //t
    System.out.println(s1.name); //son

    Father f = new Son();
    if (f instanceof Son) {
      System.out.println("Downcasting to son");
    } else if (f instanceof Daughter) {
      System.out.println("Downcasting to daughter");
    }
  }
}
