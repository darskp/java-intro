package ExceptionHandling_.Custom_exception.InvalidPassword;

public class PasswordmismatchException extends Exception {

  PasswordmismatchException(String message) {
    super(message);
  }
}
