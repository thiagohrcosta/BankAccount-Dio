public class User {
    private String firstName;
    private String lastName;

    private int bankAccount;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public int getBankAccount() {
        return bankAccount;
    }
}
