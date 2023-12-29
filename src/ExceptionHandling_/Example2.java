package ExceptionHandling_;

public class Example2 {

  public static void main(String[] args) {
    System.out.println("START");
    int[] a = { 10, 20, 30 };

    try {
      System.out.println(a[100]);
      //new ArrayIndexOutOfBoundsException();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index");
    }

    System.out.println("END");
  }
}
