package OOPS.Abstraction;

// Demonstrating Abstraction
abstract class Shape {
    // Abstract method
    public abstract double calculateArea();

    // Concrete method
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0); // Using the abstract class reference
        circle.displayShape();
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
