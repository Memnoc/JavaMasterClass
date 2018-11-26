package CONSTRUCTORS;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount1 = new BankAccount(123456, 10.00, 838076611, "Matteo", "matteo@myemail.com");
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhoneNumber());

        // Partially initialized constructor
        BankAccount bankAccount2 = new BankAccount(383564499, "Matt", "Matt@email.com");
        System.out.println(bankAccount2.getBalance());
        System.out.println(bankAccount2.getAccountNumber());
        System.out.println(bankAccount2.getCustomerName());
        System.out.println(bankAccount2.getEmail());
        System.out.println(bankAccount2.getPhoneNumber());
    }
}
