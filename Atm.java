 import java.util.Scanner;

class Atm
{
    private static double balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the ATM!");
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount you would like to deposit:");
                    double amount = sc.nextDouble();
                    deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount you would like to withdraw:");
                    amount = sc.nextDouble();
                    withdraw(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. ThankYou!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    private static void deposit(double amount) {
        balance += amount;
        System.out.println("You have successfully deposited $" + amount + ". Your new balance is: " + balance);
    }

    private static void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance. Please enter a different amount.");
        } else {
            balance -= amount;
            System.out.println("You have successfully withdrawn $" + amount + ". Your new balance is: " + balance);
        }
    }
}