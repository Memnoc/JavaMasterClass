package COMPOSITION.challenge;

public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU( "OctaCore", "Qualcomm Snapdragon", 2.1);
        Display display = new Display(1080, 240, new DisplayPanel("AMOLED", "Curved"));
        Body body = new Body("Ceramic", "Glass");

        SmartPhone MiMix3 = new SmartPhone(cpu, display, body);
        MiMix3.getBody().hideNotch();
        MiMix3.developerOptions();

    }
}
