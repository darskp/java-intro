package ExceptionHandling_.throws_.unchecked_compiler_unknown;

//divide by zero exception
// public class ArithmeticException_ {

//   static void display() {
//     System.out.println(10 / 0);
//   }

//   public static void main(String[] args) {
//     System.out.println("START");
//     display();
//     System.out.println("END");
//   }
// }

//solve using throws
public class ArithmeticException_ {

  static void display() throws ArithmeticException {
    System.out.println(10 / 0);
  }

  public static void main(String[] args) {
    System.out.println("START");
    try {
      display();
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      e.getStackTrace();
    }
    System.out.println("END");
  }
}
