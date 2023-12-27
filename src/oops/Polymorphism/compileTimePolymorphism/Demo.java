package oops.Polymorphism.compileTimePolymorphism;
// Out of so many overloaded methods, which method
// implementation should get executed is decided by the
// compiler during compile time.
public class Demo {

  public static void main(String[] args) {
    Myntra m = new Myntra();
    m.purchase("GooglePay");
    m.purchase(2500);
    m.purchase("Shoe", 3000);
  }
}
