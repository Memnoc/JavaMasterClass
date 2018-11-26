package CLASSES.challenge;

public class Main {

    public static void main(String[] args) {
        BankAccount ulsterBank = new BankAccount();

        // Current balance
        System.out.println(ulsterBank.getBalance());
        // Set new balance
        ulsterBank.setBalance(10.00);
        // Withdraw funds
        ulsterBank.withdrawFunds(5.00);
        // Deposit funds
        ulsterBank.depositFund(20.00);
        // Security check -> passed
        ulsterBank.withdrawFunds(25.00);
        // Not passed -> good
        ulsterBank.withdrawFunds(1.00);



    }
}
