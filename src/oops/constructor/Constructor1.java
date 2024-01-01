// Constructor

// Constructors are special methods that are executed when an object is created.

// Syntax:
// Access specifier ClassName(arguments) {
//     // Set of instructions
// }

// Two types of constructors:
// 1. Default
// 2. Custom - Two types - 1. Non-Parameterized, 2. Parameterized

// 1. Default Constructor
// - If a constructor is not explicitly present in a class, then the compiler will automatically generate a constructor.
// - Default constructors neither accept any arguments nor have any explicit implementation.
// - Implicitly or internally present like this:
//   ClassName() {
//   }

// 2. Custom Constructors

// Non-Parameterized Custom Constructor
// - A constructor that is explicitly defined inside a class by the programmer.
// - It does not accept any parameters or arguments.



package oops.constructor;

public class Constructor1 {

  Constructor1() {
    System.out.println("Hello");
  }
  

  public static void main(String[] args) {
    System.out.println("Start");
    Constructor1 c1 = new Constructor1();
    System.out.println("END");
  }
}
