package Functions;

public class Functions {
    // Void function - doesn't return anything
    public static void greet() {
        System.out.println("Hello, welcome to Java functions!");
    }

    // Function with parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Function with return type
    public static double multiply(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        // Calling the void function
        greet();
        
        // Calling the function with parameters
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
        
        // Calling the function with return type
        double product = multiply(4.5, 3.2);
        System.out.println("Product: " + product);
    }
}
