package ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Example 1: Arithmetic Exception
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        try {
            // Example 2: ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Fourth element: " + numbers[3]); // Out of bounds

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        try {
            // Example 3: NullPointerException
            String str = null;
            System.out.println(str.length()); // Null reference

        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered.");
        } finally {
            // Finally block (always executed)
            System.out.println("Execution completed, with or without exceptions.");
        }

        // Example 4: Throwing an Exception
        try {
            validateAge(15); // Pass invalid age
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method that throws an exception for invalid age
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }
    
}
