package Loops;

public class LoopExamples {
    public static void main(String[] args) {

        // 1. For Loop: Print numbers 1 to 5
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. While Loop: Print numbers 1 to 5
        System.out.println("\nWhile Loop Example:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // 3. Do-While Loop: Print numbers 1 to 5
        System.out.println("\nDo-While Loop Example:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}

// The For loop runs a set number of times (1 to 5).
// The While loop also prints 1 to 5, but it checks the condition before each iteration.
// The Do-While loop prints 1 to 5 as well, but it checks the condition after running at least once.