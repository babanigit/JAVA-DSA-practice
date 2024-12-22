import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        // Using LinkedList as a Queue
        LinkedList<String> linkedQueue = new LinkedList<>();
        linkedQueue.add("Task1");
        linkedQueue.add("Task2");
        linkedQueue.add("Task3");
        System.out.println("LinkedQueue: " + linkedQueue);

        // Using PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println("PriorityQueue: " + priorityQueue);

        // Removing elements
        System.out.println("Removed: " + priorityQueue.poll());
        System.out.println("PriorityQueue after removal: " + priorityQueue);
    }
}
