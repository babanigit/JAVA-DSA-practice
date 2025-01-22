import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAndHashSet {

    public static void main(String[] args) {

        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10); // Duplicate, won't be added
        hSet.add(40);
        hSet.add(50);
        hSet.add(60);
        hSet.add(70);

        System.out.println(hSet); // Output: [20, 10, 30] (Order may vary)

        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        lSet.add("Java");
        lSet.add("Python");
        lSet.add("Java"); // Duplicate, won't be added
        lSet.add("ruby");
        lSet.add("go");
        lSet.add("rust");
        lSet.add("C");
        lSet.add("javascript");

        System.out.println(lSet); // Output: [Java, Python, C++]

        TreeSet<Integer> tSet = new TreeSet<>();
        tSet.add(30);
        tSet.add(10);
        tSet.add(20);

        System.out.println(tSet); // Output: [10, 20, 30] (Sorted order)
    }
}
