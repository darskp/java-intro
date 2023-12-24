package oops.Constructor_Overloading;

public class Constructor_chaining3 extends Constructor_chaining2{

    Constructor_chaining3(int k){
    this();
    System.out.println("I am in the sub class constructor: "+k);
    }
    Constructor_chaining3(){
    super(10);
    System.out.println("I am in the sub class constructor2");
    }
    public static void main(String[] args) {
        new Constructor_chaining3(50);
    }
}
