package COMPOSITION;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "DELL", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC myPc = new PC(theCase, theMonitor, theMotherboard);
        myPc.getMonitors().drawPixelAt(1500, 1200, "red");
        myPc.getMotherboard().loadProgram("macOS Sierra");
        myPc.getTheCase().pressPowerButton();
    }
}
