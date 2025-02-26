package CollectionFramwork.QueueInterface.DequeInterface;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");

        System.out.println(queue.poll()); // Java
        System.out.println(queue.peek()); // Python
    }
}
