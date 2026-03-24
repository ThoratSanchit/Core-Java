package OOPS.Polymorphism;

// Program demonstrating Method Overloading and Method Overriding
class Calculator {
    // Method Overloading: Same method name with different parameter lists

    // Adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Adding three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adding two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

// Parent class demonstrating Method Overriding
class Animal {
    // Base class method
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class demonstrating Method Overriding
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Method Overloading demonstration
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + calc.add(10.5, 20.5));

        // Method Overriding demonstration
        Animal animal = new Animal();
        animal.sound(); // Calls the method in Animal class

        Animal dog = new Dog(); // Polymorphism: Parent reference, Child object
        dog.sound(); // Calls the overridden method in Dog class
    }
}

