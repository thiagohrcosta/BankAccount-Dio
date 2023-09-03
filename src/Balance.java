public class Balance {
    private double balance;

    public Balance(float amount) {
        this.balance = balance;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        this.balance -= withdraw;
    }

    public double getBalance() {
        return balance;
    }
}
