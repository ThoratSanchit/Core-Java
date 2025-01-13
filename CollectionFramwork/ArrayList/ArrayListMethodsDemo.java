package CollectionFramwork.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethodsDemo {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Initial List: " + list); // Output: []

        // 2. Add elements to the list
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        System.out.println("After adding elements: " + list); // Output: [Alice, Bob, Charlie]

        // 3. Add element at a specific index
        list.add(1, "David");
        System.out.println("After adding 'David' at index 1: " + list); // Output: [Alice, David, Bob, Charlie]

        // 4. Get element at specific index
        System.out.println("Element at index 2: " + list.get(2)); // Output: Bob

        // 5. Update element at specific index
        list.set(2, "Brian");
        System.out.println("After updating index 2 to 'Brian': " + list); // Output: [Alice, David, Brian, Charlie]

        // 6. Check if list contains an element
        System.out.println("Does list contain 'Alice'? " + list.contains("Alice")); // Output: true

        // 7. Remove element by value
        list.remove("David");
        System.out.println("After removing 'David': " + list); // Output: [Alice, Brian, Charlie]

        // 8. Remove element by index
        list.remove(1);
        System.out.println("After removing element at index 1: " + list); // Output: [Alice, Charlie]

        // 9. Get the size of the list
        System.out.println("Size of the list: " + list.size()); // Output: 2

        // 10. Check if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty()); // Output: false

        // 11. Add all elements from another collection
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Eve");
        newList.add("Frank");
        list.addAll(newList);
        System.out.println("After adding all elements from newList: " + list); // Output: [Alice, Charlie, Eve, Frank]

        // 12. Remove all elements in another collection
        list.removeAll(newList);
        System.out.println("After removing all elements from newList: " + list); // Output: [Alice, Charlie]

        // 13. Retain only specific elements
        list.add("Eve");
        list.add("Frank");
        list.retainAll(newList); // Retains only "Eve" and "Frank"
        System.out.println("After retaining elements in newList: " + list); // Output: [Eve, Frank]

        // 14. Convert to array
        String[] array = list.toArray(new String[0]);
        System.out.print("Array elements: ");
        for (String str : array) {
            System.out.print(str + " "); // Output: Eve Frank
        }
        System.out.println();

        // 15. Sort the list
        list.add("Charlie");
        Collections.sort(list);
        System.out.println("After sorting: " + list); // Output: [Charlie, Eve, Frank]

        // 16. Find index of an element
        System.out.println("Index of 'Eve': " + list.indexOf("Eve")); // Output: 1

        // 17. Clear all elements from the list
        list.clear();
        System.out.println("After clearing the list: " + list); // Output: []

        // 18. Check if the list is empty after clearing
        System.out.println("Is the list empty now? " + list.isEmpty()); // Output: true
    }
}
