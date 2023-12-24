// Constructor

//Constructor are special method, when we creating object simultaneously constructor will executed

// Syntax : 
// Access specifier ClassName(aruguments){
//set of instructions
// }

// 2 types
// 1. Default 
// 2. custom - 2 types - 1. Non-Parameterized, 2. Parameterized

// 1. Default constructor 
// - If a constructor is not explicitly present in a class, then the compiler will automatically generate a constructor and those constructors are called as Default
// Constructor.
//  - Default constructor neither accepts any arguments nor
// has any implementation.
//implicitly or internally present like this 
// ClassName(){

// }


// 2. custom

// Non-Parameterized Custom Constructor 
// constructor is explicitly defined inside a class by the programmer.
// not accepting any parameter/aruguments


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
