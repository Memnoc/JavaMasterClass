package POLYMORPHISM.challenge;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Fiesta fiesta = new Fiesta();
        Lancer lancer = new Lancer();
        Corolla corolla = new Corolla();

        for (int i = 1; i < 5; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i +
                    " " + car.getName() + "\n" +
                    "Engine: " + car.getEngine() + "\n" +
                    "Cylinders: " + car.getCylinders() + "\n" +
                    "Wheels: " + car.getWheels() + "\n" +
                    "Velocity: " + car.getVelocity() + "\n" +
                    "Velocity: " + car.startEngine() + "\n");

        }

    }

    public static Car randomCar() {
        int random = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + random);
        switch (random) {
            case 1:
                return new Corolla();
            case 2:
                return new Fiesta();
            case 3:
                return new Lancer();
        }
        return null;
    }
}
