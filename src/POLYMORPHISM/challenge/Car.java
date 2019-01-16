package POLYMORPHISM.challenge;

public class Car {
    private int cylinders;
    private String engine;
    private int wheels;
    private double velocity = 0;
    private String name;

    public Car(int cylinders, String engine, int wheels, double velocity, String name) {
        this.cylinders = cylinders;
        this.engine = engine;
        this.wheels = wheels;
        this.velocity = velocity;
        this.name = name;
    }

    public String startEngine() {
        this.velocity = 0;
        return "Engine started";
    }

    public double accelerate(double accelerate) {
        double acceleration = this.velocity += accelerate;
        return accelerate;
    }

    public double decelerate(double decelerate) {
        double deceleration = this.velocity -= decelerate;
        return decelerate;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public double getVelocity() {
        return velocity;
    }

    public String getName() {
        return name;
    }
}
