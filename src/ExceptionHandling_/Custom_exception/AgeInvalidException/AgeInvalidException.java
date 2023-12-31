package ExceptionHandling_.Custom_exception.AgeInvalidException;

public class AgeInvalidException extends RuntimeException {
    private String message;

    AgeInvalidException(String message) {
      this.message = message;
    }

    @Override
    public String getMessage() {
      return message;
    }

  // or

  // AgeInvalidException(String message){
  // super(message);
  // }

}
