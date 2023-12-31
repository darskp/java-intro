//! ExceptionHandling

//? What is an Error?
// interruption/mistake occur during excution of the pgm. it may be
// compile time error(syntax mistake) or run time error(without main method)

// When we get an error - we are suppose to debug it

// ?What is exception?
// an Event or interruption which stops the execution of a program (below lines of code will not get executed)

// ?ExceptionHandling
// Process of handling the exception with the help of try and catch block

// in the try block - The critical lines of code which gives an exception should be written inside the try block
// catch block - soultion should be written within the catch block
// catch block will be exceuted only if an exception occur


// Throwable

// 2 types
// 1. Error
// 2. Exception
// - File not found exception 
// - classnotfound exception
// - interrupted Execption
// - IO exception
// all the above exceptions inherited from exception class directly - also called checked exception - handled immediately - compiler known

// under exception  - 1 type - run time exception also called as unchecked exception -compilter unknown - not handled immediately
// - ArithmeticException
// - ArrayIndexOutOfBoundsException
// - NullPointerException
// - ClassCasteExecption




//TODO Syntax of Try catch block

// try{
//set of instruction
// }catch(ExceptionName referncename){
//handle the exception
// }


//? example - 
// int[] a = { 10, 20, 30 };

//     try {
//       System.out.println(a[100]);
//     } catch (ArrayIndexOutOfBoundsException e) {
//       System.out.println("Invalid index");
//     }

// internally it works like this 
// ArrayIndexOutOfBoundsException e= new ArrayIndexOutOfBoundsException();
// throw e;


// Step 1 : an object of ArrayIndexOutOfBoundsException will get Created 
// ArrayIndexOutOfBoundsException e= new ArrayIndexOutOfBoundsException();
// Step 2: that object is throw
// throw e;
// Step 3:  it is caught by the catch block

// one try block can have any number of catch blocks


//Todo Execption <- run time exception <- Arithmetic Exception

// catch (Execption e)
// Upcasting
// Super class refernce and sub class object 
// always add the super class exaception handler at the end

//sequential 



//! Methods present in Throwable class

//?   1. printStackTrace()
// catch(Exception e){
// e.printStackTrace(); //complete info about the exception - exception name, exception type line no
// }

//?   2. getMessage()
// catch(Exception e){
// e.getMessage(); //small message about the perticular exception
// }





