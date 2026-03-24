import java.util.ArrayList;
import java.util.List;

// Generic class — works with any type
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }

    @Override
    public String toString() { return "Box[" + value + "]"; }
}

// Generic class with two type parameters
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }

    @Override
    public String toString() { return key + " = " + value; }
}

// Bounded type parameter — T must be a Number (or subclass)
class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) { this.number = number; }

    public double doubleValue() { return number.doubleValue(); }
}

public class GenericsDemo {

    // Generic method
    public static <T> void printArray(T[] array) {
        for (T item : array) System.out.print(item + " ");
        System.out.println();
    }

    // Wildcard — accepts List of any type
    public static void printList(List<?> list) {
        for (Object item : list) System.out.print(item + " ");
        System.out.println();
    }

    // Upper bounded wildcard — accepts List<Number> or List<Integer> etc.
    public static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {

        // Generic class usage
        Box<String> strBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(42);
        System.out.println(strBox);  // Box[Hello]
        System.out.println(intBox);  // Box[42]

        // Two type parameters
        Pair<String, Integer> pair = new Pair<>("age", 25);
        System.out.println(pair);  // age = 25

        // Bounded type
        NumberBox<Integer> nb = new NumberBox<>(100);
        System.out.println(nb.doubleValue());  // 100.0
        // NumberBox<String> sb = new NumberBox<>("hi"); // ← compile error

        // Generic method
        Integer[] ints = {1, 2, 3};
        String[] strs = {"a", "b", "c"};
        printArray(ints);  // 1 2 3
        printArray(strs);  // a b c

        // Wildcard
        List<String> names = List.of("Alice", "Bob");
        List<Integer> nums = List.of(10, 20, 30);
        printList(names);  // Alice Bob
        printList(nums);   // 10 20 30

        // Upper bounded wildcard
        System.out.println(sumList(nums));  // 60.0
    }
}
