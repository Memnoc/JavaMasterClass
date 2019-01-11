package ENCAPSULATION;

public class Printer {

    private int tonerLevel = 100;
    private int numberOfPages;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPages = numberOfPages;
        this.isDuplex = isDuplex;
    }

   public void fillUpToner(int charge) {
        int currentTonerLevel = this.tonerLevel += charge;
        if (currentTonerLevel >100) {
            System.out.println("Cannot charge toner. Already at max");
            this.tonerLevel = 100;
        } else {
            System.out.println("Toner level is: " + getTonerLevel());
        }
    }

    public void printPages (int pages) {
        if (isDuplex) {
            int duplexPages = this.numberOfPages = pages/2;
            System.out.println("Number of printed pages is: " + duplexPages);
        } else {
            int nonDuplexPages = this.numberOfPages = pages;
            System.out.println("Number of printed pages is: " + nonDuplexPages);
        }


    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
