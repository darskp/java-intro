//! Libraries
// 1. A collection of pre-defined packages.
// 2. Each package/folder is a collection of pre-defined classes and pre-defined interfaces.
// 3. Each class or interface is a collection of variables and methods.

// Main 3 Java libraries are
// 1. java.lang
// 2. java.util
// 3. java.io

// 1. java.lang package
// This package is implicitly or automatically imported in all Java classes and interfaces.

// 2. Object Class
// - Object is a pre-defined class present in the java.lang package.
// - The Object class is referred to as the supermost class in Java.
// - The Object class is implicitly inherited by all Java classes.

// Methods present in the Object Class
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
// Syntax: public String toString()
// - toString() returns the String representation of an Object in the following format:
// FullyQualifiedClassName @ HexadecimalValueOfTheHashCode

// Example:
// package com;
// class Person {
//     psvm() {
//         Person p = new Person();
//         sout(p); // com.Person@hexacode  
//         // Internally, toString() method is invoked like this: p.toString()
//         // To avoid printing the hashcode, we need to override the methods because Object is the superclass,
//         // and Person is the subclass, which is inherited from the Object.
//     }
// }
