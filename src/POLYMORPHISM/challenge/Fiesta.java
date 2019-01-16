package POLYMORPHISM.challenge;

public class Fiesta extends Car {
    public Fiesta() {
        super (8, "Diesel", 4, 0, "Ford Fiesta");
    }

    @Override
    public String startEngine() {
        return "Fiesta has started";
    }

    @Override
    public double accelerate(double accelerate) {
        return super.accelerate(accelerate);
    }

    @Override
    public double decelerate(double decelerate) {
        return super.decelerate(decelerate);
    }
}
