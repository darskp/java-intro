// Abstract

// 'abstract' is a keyword that can be used with classes and methods.

// NOTE:
// 1. Can a class inherit from an abstract class? -> YES
// 2. We cannot create an object of an abstract class because it may contain abstract methods without implementation.
// 3. Abstract methods cannot be private, static, or final, as the goal is to override them later.

//! 1. Concrete Class

// A class that is not declared using the 'abstract' keyword is called a Concrete class.
// A Concrete class can contain only concrete methods.

// Example:
// public class Person {
//     // Concrete class
//     void display() {
//         // Concrete method implementation
//     }
// }

//! 2. Abstract Class

// A class that is declared using the 'abstract' keyword is called an Abstract class.
// An Abstract class can contain both abstract and concrete methods.

// Example:
// public abstract class Person {
//     void eat() {
//         // Implementation of a concrete method
//     }

//     abstract void work(); // Declaration of an abstract method
// }

// 6. A Concrete method has both declaration and implementation/definition.

// 7. An Abstract method has only a declaration but no implementation.
// Syntax - Access specifier abstract return type methodName(optional arguments);

// 8. All abstract methods should be declared using the 'abstract' keyword.
