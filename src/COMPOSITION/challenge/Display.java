package COMPOSITION.challenge;


public class Display {
    private int resolution;
    private int DPI;
    private DisplayPanel panel;

    public Display(int resolution, int DPI, DisplayPanel panel) {
        this.resolution = resolution;
        this.DPI = DPI;
        this.panel = panel;
    }

    public void androidEasterEgg(int version, String name) {
        System.out.println(" Type 3 times. Version is " + version + name);
    }

    public int getResolution() {
        return resolution;
    }

    public int getDPI() {
        return DPI;
    }

    public DisplayPanel getPanel() {
        return panel;
    }
}
