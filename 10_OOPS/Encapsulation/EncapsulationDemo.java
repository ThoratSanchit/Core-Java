package OOPS.Encapsulation;

// Demonstrating Encapsulation
class Student {
    private String name;  // Private variable
    private int age;      // Private variable

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Method to display student details
    public String display() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);

        // Accessing and modifying private variables via getters and setters
        System.out.println(student.display());
        student.setAge(25);
        System.out.println("Updated Age: " + student.getAge());
    }
}
