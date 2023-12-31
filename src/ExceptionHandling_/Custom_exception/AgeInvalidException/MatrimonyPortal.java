package ExceptionHandling_.Custom_exception.AgeInvalidException;

import java.util.Scanner;

public class MatrimonyPortal {

  public static void main(String[] args) {
    int cutoffAge = 21;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your age : ");
    int age = s.nextInt();

    if (age >= cutoffAge) {
      System.out.println("Get married soon");
    } else {
      try {
        AgeInvalidException obj = new AgeInvalidException("Not yet 21");
        throw obj;
      } catch (AgeInvalidException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
