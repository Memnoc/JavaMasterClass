package POLYMORPHISM.challenge;

public class Lancer extends Car {
    public Lancer() {
        super(16, "Hybrid", 4, 0, "Mitusbishi Lancer");
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
