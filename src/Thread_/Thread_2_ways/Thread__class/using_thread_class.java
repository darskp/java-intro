package Thread_.Thread_2_ways.Thread__class;

public class using_thread_class {

  public static void main(String[] args) {
    Tom t = new Tom();
    t.start();
    //new to create a new stack and call run()

    Jerry j = new Jerry();
    System.out.println(t.getId());
    System.out.println(t.getName());
    System.out.println(t.getPriority());
    j.start();
        j.setName("JERRYY_renames");

  }
}
