package COMPOSITION.challenge;

public class CPU {
    private String cores;
    private String soc;
    private double frequency;

    public CPU(String cores, String soc, double frequency) {
        this.cores = cores;
        this.soc = soc;
        this.frequency = frequency;
    }

    public String getCores() {
        return cores;
    }

    public String getSoc() {
        return soc;
    }

    public double getFrequency() {
        return frequency;
    }
}
