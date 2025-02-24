package CollectionFramwork.ListInterface.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Step 1: Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Step 2: Use push() to add elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push operations: " + stack);

        // Step 3: Use peek() to view the top element without removing it
        System.out.println("Top element using peek(): " + stack.peek());

        // Step 4: Use pop() to remove the top element
        System.out.println("Element popped: " + stack.pop());
        System.out.println("Stack after pop operation: " + stack);

        // Step 5: Use isEmpty() to check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Step 6: Use search() to find the position of an element (1-based indexing)
        System.out.println("Position of 10 using search(): " + stack.search(10));
        System.out.println("Position of 40 (not in stack): " + stack.search(40));

        // Step 7: Use size() to check the number of elements in the stack
        System.out.println("Size of stack: " + stack.size());

        // Step 8: Use clear() to remove all elements from the stack
        stack.clear();
        System.out.println("Stack after clear(): " + stack);
    }
}

