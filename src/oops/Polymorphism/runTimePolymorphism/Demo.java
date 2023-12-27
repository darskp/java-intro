// method binding - mapping the method caller to it's implementation
// polymorphism - many forms
//  ability of  method behave differently when different objects are acting upon it

// ex - work() - hr, dev, tester is different

// 2 types
// 1. Compile time polymorphism - method overloading
// 2. Run time polymorphism - IS-a relationship, method overriding, upcasting

package oops.Polymorphism.runTimePolymorphism;

public class Demo {

  void invoke(Employee e) {
    e.Work();
  }

  public static void main(String[] args) {
    //upcasting
    Employee e1 = new Developer();
    e1.Work(); // I am a Developer

    Employee e2 = new Tester();
    e2.Work(); //Tester -
    //     Out of so many Overridden method, which method
    // implementation should get executed is decided by the JVM
    // at runtime.
    System.out.println("---------------");
    Demo e = new Demo();
    e.invoke(new Developer());
    e.invoke(new Tester());
  }
}
