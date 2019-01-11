package ENCAPSULATION;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer(90, 0, false);
        Printer printer2 = new Printer(90, 0, true);

        System.out.println(printer1.getNumberOfPages());
        System.out.println(printer1.getTonerLevel());
        System.out.println(printer1.isDuplex());

        printer1.fillUpToner(11);

        printer2.printPages(100);
        printer1.printPages(100);




    }
}
