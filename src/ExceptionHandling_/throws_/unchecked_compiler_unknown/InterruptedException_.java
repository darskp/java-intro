package ExceptionHandling_.throws_.unchecked_compiler_unknown;

public class InterruptedException_ {

  static void display() throws InterruptedException {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
      Thread.sleep(2000);
    }
  }

  public static void main(String[] args) {
    System.out.println("START");
    try {
      display();
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
      e.getStackTrace();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("I am executed, super class");
    }
    System.out.println("END");
  }
}
