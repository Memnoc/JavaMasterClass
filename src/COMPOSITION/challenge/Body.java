package COMPOSITION.challenge;

public class Body {
    private String material;
    private String finishing;

    public Body(String material, String finishing) {
        this.material = material;
        this.finishing = finishing;
    }

    public void hideNotch() {
        System.out.println("Notch sucks so it's hidden!");
    }

    public String getMaterial() {
        return material;
    }

    public String getFinishing() {
        return finishing;
    }
}
