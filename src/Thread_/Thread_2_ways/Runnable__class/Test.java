package Thread_.Thread_2_ways.Runnable__class;

public class Test {

  public static void main(String[] args) {
    // Tom t = new Tom();
    // Thread th = new Thread(t);
    //convert runnable type of objects to thread object
    // th.start();

    // or
    Thread t= new Thread(new Tom(),"hi");
    //invoking start()
    t.start();
  }
}
