package CollectionFramwork.QueueInterface.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(20);

        System.out.println(queue.poll()); // 5 (removes and returns the head)
        System.out.println(queue.peek()); // 10 (returns the head without removing it)
    }
}
