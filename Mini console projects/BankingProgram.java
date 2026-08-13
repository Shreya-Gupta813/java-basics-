import java.util.Scanner;

public class BankingProgram {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("\n*******************");
            System.out.println("**BANKING PROGRAM**");
            System.out.println("*******************");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT\n");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> {
                    balance -= withdraw(balance);
                    // System.out.printf("%nRemaining Balance: $%,.2f\n", balance);
                }
                case 4 -> {
                    System.out.println("Exiting Program");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("Thankyou Have a nice day!!");
        s.close();
    }

    static void showBalance(double balance) {
        System.out.printf("$%,.2f", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("enter the amount to deposit: ");
        amount = s.nextDouble();
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else {
            System.out.printf("$%,.2f Deopsited\n", amount);
            return amount;
        }

    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter the amount to be withdrawn: ");
        amount = s.nextDouble();
        if (amount < 0) {
            System.out.println("Amount Cannot be negative");
            return 0;
        } else {
            if (balance < amount) {
                System.out.println("Insufficient Balance");
                System.out.printf("Balance is: $%,.2f\n", balance);
                return 0;
            } else {
                System.out.printf("$%,.2f Withdrawn", amount);
                return amount;
            }
        }
    }

}
