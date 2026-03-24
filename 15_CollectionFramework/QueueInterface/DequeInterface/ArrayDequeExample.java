package CollectionFramwork.QueueInterface.DequeInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Java");
        deque.addLast("Python");
        deque.addLast("C++");

        System.out.println(deque.removeFirst()); // Java
        System.out.println(deque.removeLast());  // C++
    }
}