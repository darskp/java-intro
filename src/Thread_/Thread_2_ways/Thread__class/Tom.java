package Thread_.Thread_2_ways.Thread__class;

public class Tom extends Thread {

  @Override
  public void run() {
    //the task which has to be perform by the thread is return inside the run method
    for (int j = 0; j < 5; j++) {
      System.out.println("j: " + j);
      try {
        Thread.sleep(1000);
        //used to pause the execution for a specified ms
        // static method present in thread class
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
