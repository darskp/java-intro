//! Exception Handling

//? What is an Error?
// An interruption or mistake that occurs during the execution of the program. It may be
// a compile-time error (syntax mistake) or a runtime error (e.g., without a main method).

// When an error occurs, we are supposed to debug it.

// ? What is an Exception?
// An event or interruption that stops the execution of a program. The lines of code below will not get executed.

// ? Exception Handling
// The process of handling exceptions with the help of a try and catch block.

// In the try block, the critical lines of code that may throw an exception should be written.
// The catch block contains the solution for handling the exception.
// The catch block is executed only if an exception occurs.

// Throwable

// Two types
// 1. Error
// 2. Exception
// Examples of exceptions:
// - FileNotFoundException
// - ClassNotFoundException
// - InterruptedException
// - IOException
// All the above exceptions inherit from the Exception class directly, also called checked exceptions, and are handled immediately (compiler known).

// Under Exception, there is one type: runtime exception, also called unchecked exception, where the compiler is unaware and doesn't handle it immediately.
// Examples:
// - ArithmeticException
// - ArrayIndexOutOfBoundsException
// - NullPointerException
// - ClassCastException

//TODO Syntax of Try-Catch block

// try{
//   // Set of instructions
// } catch (ExceptionName referenceName) {
//   // Handle the exception
// }

//? Example - 
// int[] a = {10, 20, 30};

// try {
//   System.out.println(a[100]);
// } catch (ArrayIndexOutOfBoundsException e) {
//   System.out.println("Invalid index");
// }

// Internally works like this 
// ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
// throw e;

// Step 1: An object of ArrayIndexOutOfBoundsException gets created 
// ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
// Step 2: That object is thrown
// throw e;
// Step 3: It is caught by the catch block

// One try block can have any number of catch blocks

//Todo Exception <- RuntimeException <- ArithmeticException

// catch (Exception e)
// Upcasting
// Superclass reference and subclass object 
// Always add the superclass exception handler at the end

// Sequential 

//! Methods present in Throwable class

//? 1. printStackTrace()
// catch (Exception e) {
//   e.printStackTrace(); // Complete info about the exception - exception name, exception type, line number
// }

//? 2. getMessage()
// catch (Exception e) {
//   e.getMessage(); // Small message about the particular exception
// }
