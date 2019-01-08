package COMPOSITION.challenge;

public class SmartPhone {
    private CPU cpu;
    private Display display;
    private Body body;

    public SmartPhone(CPU cpu, Display display, Body body) {
        this.cpu = cpu;
        this.display = display;
        this.body = body;
    }

    public void developerOptions() {
        display.androidEasterEgg(9, "Android Pie");
    }

    public CPU getCpu() {
        return cpu;
    }

    private Display getDisplay() {
        return display;
    }

    public Body getBody() {
        return body;
    }
}
