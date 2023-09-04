public class Balance {
    private double balance;

    public Balance(float amount) {
        this.balance = balance;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        if(withdraw > balance) {
            System.out.println("You balance is " + balance + ", you don't have this amount to withraw.");
        } else {
            this.balance -= withdraw;
        }
    }

    public double getBalance() {
        return balance;
    }
}
