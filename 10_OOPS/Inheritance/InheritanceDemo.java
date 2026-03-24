package OOPS.Inheritance;

// Demonstrating Inheritance
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving...");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Inherited from Vehicle class
        car.drive(); // Defined in Car class
    }
}
