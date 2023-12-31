package oops.Singleton.Example1;

public class Account {

  private static Account obj = null;

  private Account() {
    System.out.println("Object created");
  }

  public static void createObject() {
    if (obj == null) {
      obj = new Account();
    } else {
      System.out.println("Can't create object");
    }
  }
}
