//! Libraries 
// 1. It is a collection of pre-defined packages.
// 2. Each package/folder is collection of pre-defined classes and pre-defined interfaces.
// 3. Each class or interface is a collection of variables and methods.


// Main 3 java libraries are
// 1. java.lang
// 2. java.util
// 3. java.io

// 1. java.lang package
// This package is implicitly or automatically imported in all java classes and interfaces. 

// 2. Object Class
// - Object is a pre-defined class present in java.lang package.
// - Object class is referred as super-most class in java.
// - Object class is implicitly inherited by all java classes.

// methods present in Object Class
// 1. protected Object clone()
// 2. public boolean equals(Object o)
// 3. public int hashCode()
// 4. public String toString()
// 5. public void wait()
// 6. public void wait(long a)
// 7. public void wait(long a, int b)
// 8. public void notify()
// 9. public void notifyAll()
// 10. public Class getClass()
// 11. protected void finalize()


//! 1. public String toString()
// syntax : public String toString()
// - toString() returns the String representation of an Object in the below format
// FullyQualifiedClassName @ HexadecimalValueOfTheHashCode

// package com;
// class Person{

//     psvm(){
//     Person p=new Person();
//     sout(p);// com.Person@hexacode  
//     internally toString() method is invoking like this - p.tostring()
//     to avoid to print the hashcode, we need to override the methods bcz Object is super class and Person is sub class which is inherited from the Object
// }
// }

