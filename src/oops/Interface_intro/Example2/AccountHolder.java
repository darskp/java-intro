package oops.Interface_intro.Example2;

public class AccountHolder implements HDFCBank {

  @Override
  public void deposit() {
    System.out.println("Deposited");
  }

  @Override
  public void withdraw() {
    System.out.println("Withdrawn");
  }

  public static void main(String[] args) {
    AccountHolder a = new AccountHolder();
    a.deposit();
    a.withdraw();
  }
}
