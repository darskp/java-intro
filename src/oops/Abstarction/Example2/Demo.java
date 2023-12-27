package oops.Abstarction.Example2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Welcome to HDFC BANK ATM!");
        System.out.println("-------");
        Bank hdfc = new ATM();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1: Deposit\n2: Withdraw\n3: Check Balance\n4: Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposit : ");
                    int amt = sc.nextInt();
                    hdfc.deposit(amt);
                    hdfc.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw : ");
                    int am = sc.nextInt();
                    hdfc.withdraw(am);
                    hdfc.checkBalance();
                    break;
                case 3:
                    hdfc.checkBalance();
                    
                    break;
                case 4:
                    System.out.println("------------");
                    System.out.println("Thank you! Visit Again");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("-----------------------");
            System.out.println("1: Continue\n2: Exit\n");
            int opStatus = sc.nextInt();

            if (opStatus == 2) {
                System.out.println("Thank you! Visit Again");
                System.exit(0);
            } else if (opStatus == 1) {
                continue;
            } else {
                System.out.println("Invalid");
                System.exit(0);
            }
        }
    }
}
