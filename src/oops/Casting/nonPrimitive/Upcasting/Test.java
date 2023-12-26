package oops.Casting.nonPrimitive.Upcasting;

//upcasting - sub class object and address refrence is super class
// - can access only super class properties not sub class properties
// - IS-A relationship or inheritance is mandatory
// implicitly happens

// Father f=new son();

// or 

// Son s=new son();
// Father f=s;

public class Test {
    public static void main(String[] args) {
        Father f=new Son();
        System.out.println(f);
    System.out.println(f.age);
    // System.out.println(f.name); error
    }
    
}
