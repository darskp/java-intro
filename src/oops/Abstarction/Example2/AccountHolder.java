package oops.Abstarction.Example2;

public class AccountHolder {
    public static void main(String[] args) {
        //upcasting
        Bank hdfc=new ATM();
        hdfc.deposit(1000);
        hdfc.checkBalance();
    }
}
