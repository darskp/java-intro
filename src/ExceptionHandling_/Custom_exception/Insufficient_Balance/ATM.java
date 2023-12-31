package ExceptionHandling_.Custom_exception.Insufficient_Balance;

import java.util.Scanner;

public class ATM {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int balance = 10000;
    System.out.println("Enter the amount ton be withdrawn: ");
    int amount = s.nextInt();
    if (amount <= balance) {
      System.out.println("Withdrawal Successful");
    } else {
      try {
        throw new InsufficientBalanceException("Insufficient Balance");
      } catch (InsufficientBalanceException e) {
        System.out.println(e.getMessage());
      } finally {
        s.close();
      }
    }
  }
}