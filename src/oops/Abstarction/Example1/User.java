//! Abstraction

//  Hiding the Implementation details and showing only the functionalities 
// Need to follow 4 rules 
// 1. AC/Interface
// 2. IS-a
// 3. Method overriding
// 4. upcasting


package oops.Abstarction.Example1;

public class User {

    public static void main(String[] args) {
        // Employee e=new Employee();
        // e.work();

        //too hide the implemention and need to showing only functionality - if you hover on the work 

        Person p=new Employee();
        p.work();
    }
    
}
