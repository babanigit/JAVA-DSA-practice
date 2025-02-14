import java.util.*;
import java.util.LinkedList;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // 1. List Example (Ordered collection, allows duplicates)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.addAll(Arrays.asList("Cherry", "Date"));
        arrayList.remove("Banana");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Contains 'Apple': " + arrayList.contains("Apple"));
        System.out.println("Get element at index 1: " + arrayList.get(1));

        // LinkedList Example (Doubly linked list, fast insertions/deletions)
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alpha");
        linkedList.add("Beta");
        linkedList.addFirst("Start");
        linkedList.addLast("End");
        linkedList.remove("Beta");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("First Element: " + linkedList.getFirst());

        // 2. Set Example (Unique elements, unordered)
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.remove(10);
        System.out.println("HashSet: " + hashSet);
        System.out.println("Set Size: " + hashSet.size());

        // 3. Queue Example (FIFO - First In, First Out)
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Zebra");
        priorityQueue.offer("Monkey");
        System.out.println("PriorityQueue Peek: " + priorityQueue.peek());
        System.out.println("Poll: " + priorityQueue.poll());
        System.out.println("Remaining Queue: " + priorityQueue);

        // 4. Deque Example (Double-ended queue)
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("Front");
        arrayDeque.addLast("Back");
        System.out.println("Deque: " + arrayDeque);
        arrayDeque.removeFirst();
        System.out.println("After removeFirst(): " + arrayDeque);

        // 5. Map Example (Key-value pairs, unique keys)
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for key 1: " + hashMap.get(1));
        hashMap.replace(2, "Second");
        System.out.println("Updated HashMap: " + hashMap);

        // 6. Stack Example (LIFO - Last In, First Out)
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println("Stack: " + stack);
        System.out.println("Stack Peek: " + stack.peek());
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
