package oops.Abstarction.Example2;

class ATM implements Bank {
    private int balance = 0;

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
