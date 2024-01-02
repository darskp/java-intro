package Thread_.Thread_2_ways.Thread__class;

public class Jerry extends Thread {

  @Override
  public void run() {
    for (int i = 5; i <10; i++) {
      System.out.println("i: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
