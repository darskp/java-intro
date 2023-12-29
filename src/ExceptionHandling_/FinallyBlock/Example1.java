//! Finally Block
// The set of instructions which has to be executed all the time has to witten within the finally block
//We can have try and catch block within finally block
package ExceptionHandling_.FinallyBlock;

public class Example1 {

  public static void main(String[] args) {
    System.out.println("START");

    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {
      System.out.println("Invalid");
            System.out.println("------------------------");
      e.printStackTrace();
      System.out.println("------------------------");
      System.out.println(e.getMessage());
            System.out.println("------------------------");
    } catch (Exception e) {
      System.out.println("exception super class");
    } finally {
      System.out.println("Inside Finally Block");
    }
    System.out.println("END");
  }
}
