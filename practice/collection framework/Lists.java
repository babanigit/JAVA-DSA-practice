import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> aList = new ArrayList<>();

        // Adding elements
        aList.add("Apple");
        aList.add("Banana");
        aList.add("Cherry");

        // Accessing elements
        System.out.println(aList.get(1)); // Output: Banana

        // Updating elements
        aList.set(1, "Blueberry");

        // Removing elements
        aList.remove(2);

        // Iterating through the aList
        for (String fruit : aList) {
            System.out.println(fruit);
        }

        // Creating a LinkedList
        LinkedList<Integer> lList = new LinkedList<>();

        // Adding elements
        lList.add(10);
        lList.add(20);
        lList.add(30);

        // Adding elements at specific positions
        lList.addFirst(5);
        lList.addLast(35);

        // Accessing elements
        System.out.println(lList.get(2)); // Output: 10

        // Removing elements
        lList.removeFirst();
        lList.removeLast();

        // Printing the lList
        System.out.println(lList); // Output: [10, 20, 30]

    }

}
