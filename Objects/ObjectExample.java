package Objects;

public class ObjectExample {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Red", 120);
        Car car2 = new Car("BMW", "Blue", 150);

        // Accessing object methods
        car1.displayInfo();
        car2.displayInfo();

        // Modify state and display behavior
        car1.accelerate(30);
        car2.accelerate(20);
    }
}

class Car {
    // Attributes (State)
    String brand;
    String color;
    int speed;

    // Constructor to initialize object
    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Method (Behavior)
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Speed: " + speed + " km/h");
    }

    // Method to increase speed
    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated to " + speed + " km/h.");
    }
}