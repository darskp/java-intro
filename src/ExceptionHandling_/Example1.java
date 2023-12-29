package ExceptionHandling_;

import java.util.Scanner;

public class Example1 {

  public static void main(String[] args) {
    System.out.println("START");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a = scan.nextInt();
    System.out.println("Enter the value of b:");
    int b = scan.nextInt();

    try {
      System.out.println(a / b);
    } catch (ArithmeticException e) {
      System.out.println("B should not be zero");
    }
    
    scan.close();
    System.out.println("END");
  }
}
