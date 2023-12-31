package ExceptionHandling_.Custom_exception.InvalidPassword;

// Take input from the user and print Login successful if the password is correct.
// If the password is mismatched, create your own custom exception.

import java.util.Scanner;

public class login {

  public static void main(String[] args) {
    String correctPassword = "Darshan@123";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Password");

    String userEnteredPassword = sc.next();

    try {
      if (!correctPassword.equals(userEnteredPassword)) {
        throw new PasswordmismatchException("Password is mismatched");
      }
      System.out.println("Login successful");
    } catch (PasswordmismatchException e) {
      System.out.println("Login failed: " + e.getMessage());
    } finally {
      sc.close();
    }
  }
}
