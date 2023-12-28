package oops.Singleton.Example2;

public class AadhaarCard {

    int number=1111; //non static

  private static AadhaarCard a;

  private AadhaarCard() {
    System.out.println("Object created");
  }

  public static AadhaarCard CreateObject() {
    if (a == null) {
      a=new AadhaarCard();
    }
    return a;
  }
}
