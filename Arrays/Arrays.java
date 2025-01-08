package Arrays;

// An array is a collection of elements of the same type stored in contiguous memory locations.
// In Java, arrays are objects that allow you to store a fixed-size sequence of elements.
//  Each element can be accessed using its index, starting from 0.

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Print first and third elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Modify second element
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        // Print all elements
        System.out.println("All elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Calculate and print sum
        int sum = 0;
        for (int num : numbers)
            sum += num;
        System.out.println("Sum: " + sum);

    }
}
