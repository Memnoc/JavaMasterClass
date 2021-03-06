package CONSTRUCTORS;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private long phoneNumber;
    private String customerName;
    private String email;

    public BankAccount() {
        this(56789, 2.50, +353000000, "default name", "default address");
        System.out.println("default constructor called");
    }

    public BankAccount(long accountNumber, double balance, long phoneNumber, String customerName, String email) {
        System.out.println("custom constructor called");
        setAccountNumber(accountNumber);
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount(long phoneNumber, String customerName, String email) {
        this(9994, 10.50, phoneNumber, customerName, email);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositFund(double balance) {
        this.balance += balance;
        System.out.println("Deposit amount of " + balance + " processed. Balance: " + this.balance);
    }

    public void withdrawFunds(double balance) {
        if (balance > this.balance || this.balance <0) {
            System.out.println("Cannot withdraw, insufficient funds: " + "BALANCE: " + this.balance);
        } else {
            this.balance -= balance;
            System.out.println("Withdrawal of " + balance + " processed. Remaining balance: " + this.balance);
        }
    }
}
