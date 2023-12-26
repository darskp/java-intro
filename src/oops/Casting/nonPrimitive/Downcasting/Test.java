package oops.Casting.nonPrimitive.Downcasting;

//downcasting - super class object and the address refrence is sub class
// - can access both super class and sub class properties
// - IS-A relationship or inheritance is mandatory and also upcasting is mandatory
// explicitly we need to convert

// Step 1. upcasting
// Father f=new son();
// or
// Son s=new son();
// Father f=s;

// Step 2. Son s =(Son) f;

public class Test {

  public static void main(String[] args) {
    //downcasting

    Father f = new Son();
    Son s = (Son) f;
    System.out.println(s.age);
    System.out.println(s.name);
  }
}
