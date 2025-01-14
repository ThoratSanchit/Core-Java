package CollectionFramwork.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // **Basic Operations**
        System.out.println("**Basic Operations**");
        list.add("A"); // Add element to the end
        list.add("B");
        list.add(1, "C"); // Add at specific index
        System.out.println("After adding elements: " + list);

        list.set(1, "D"); // Update element at index 1
        System.out.println("After setting index 1 to 'D': " + list);

        list.remove(2); // Remove element at index 2
        System.out.println("After removing index 2: " + list);

        System.out.println("Element at index 1: " + list.get(1)); // Get element at index 1

        System.out.println("Size of the list: " + list.size()); // Get the size of the list
        System.out.println();

        // **Queue-Specific Operations**
        System.out.println("**Queue-Specific Operations**");
        list.offer("E"); // Add element to the end
        System.out.println("After offer 'E': " + list);

        System.out.println("Peek (first element): " + list.peek()); // Get first element without removing

        System.out.println("Poll (remove first element): " + list.poll()); // Remove and get the first element
        System.out.println("After poll: " + list);
        System.out.println();

        // **Deque-Specific Operations**
        System.out.println("**Deque-Specific Operations**");
        list.addFirst("Start"); // Add element at the beginning
        list.addLast("End"); // Add element at the end
        System.out.println("After addFirst and addLast: " + list);

        System.out.println("Get first element: " + list.getFirst()); // Access first element
        System.out.println("Get last element: " + list.getLast()); // Access last element

        list.removeFirst(); // Remove the first element
        list.removeLast(); // Remove the last element
        System.out.println("After removeFirst and removeLast: " + list);
        System.out.println();

        // **Traversal**
        System.out.println("**Traversal**");
        System.out.println("Using for-each loop:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("Using descending iterator (reverse order):");
        var iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

