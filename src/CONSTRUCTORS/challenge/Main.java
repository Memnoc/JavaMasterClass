package CONSTRUCTORS.challenge;

public class Main {

    public static void main(String[] args) {
        // First constructor
        VipCustomer matteo = new VipCustomer();
        System.out.println(matteo.getName());
        System.out.println(matteo.getEmailAddress());
        System.out.println(matteo.getCreditLimit());
//        Matteo
//        matteo@email.com
//        100.0

        // Second constructor
        VipCustomer fabio = new VipCustomer("Fabio", "fabio@email.com");
        System.out.println(fabio.getName());
        System.out.println(fabio.getEmailAddress());
        System.out.println(fabio.getCreditLimit());
//        Fabio
//        fabio@email.com
//        120.0

        VipCustomer gianni = new VipCustomer("Gianni", "gianni@email.com", 150.0);
        System.out.println(gianni.getName());
        System.out.println(gianni.getEmailAddress());
        System.out.println(gianni.getCreditLimit());
//        Gianni
//        gianni@email.com
//        150.0
        // test
    }
}
