import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Bank");
        System.out.println("====================");

        System.out.println("Type your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Type your last name: ");
        String lastName = scanner.nextLine();

        User user = new User(firstName, lastName);

        System.out.println("Welcome " + user.fullName());

        System.out.println("Your bank account number is: ");
        int randomNumber = random.nextInt(9999);
        String formattedRandomNumber = String.format("%04d", randomNumber);
        System.out.println(formattedRandomNumber);

        Balance balance = new Balance(0);

        int userChoice;

        do {
            System.out.println("What would you like to do? 1 - Check my balance; 2 - Deposit; 3 - Withdraw; 4 - Exit");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Your balance is: " + balance.getBalance());
                    break;
                case 2:
                    System.out.println("How much would you like to deposit? ");
                    double deposit = scanner.nextDouble();
                    balance.deposit(deposit);
                    break;
                case 3:
                    System.out.println("How much would you like to withdraw? ");
                    double withdrawn = scanner.nextDouble();
                    balance.withdraw(withdrawn);
                    break;
                case 4:
                    System.out.println("Thank you for using the bank!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1 - Check my balance; 2 - Deposit; 3 - Withdraw; 4 - Exit");
            }
        } while (userChoice != 4);

        scanner.close();
    }
}
