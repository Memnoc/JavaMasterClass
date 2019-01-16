package POLYMORPHISM.challenge;

public class Corolla  extends Car {
    public Corolla() {
        super (4, "Petrol", 4, 0, "Toyota Corolla");
    }

    @Override
    public String startEngine() {
        return "Corolla has started";
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
