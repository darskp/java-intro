package ExceptionHandling_.Custom_exception.Insufficient_Balance;

public class InsufficientBalanceException extends Exception {

  InsufficientBalanceException(String mes) {
    super(mes);
  }
}
