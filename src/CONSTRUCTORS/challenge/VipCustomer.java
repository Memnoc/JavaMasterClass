package CONSTRUCTORS.challenge;

public class VipCustomer {
    private String name;
    private String emailAddress;
    private double creditLimit;


    // First constructor
    public VipCustomer() {
        this("Matteo", "matteo@email.com", 100.0);
    }

    // Second constructor
    public VipCustomer(String name, String emailAddress) {
        this(emailAddress, name, 120.0);
    }

    // Third constructor
    public VipCustomer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
