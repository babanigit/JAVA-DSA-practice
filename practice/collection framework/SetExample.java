import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // Using HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); // Duplicate, ignored
        System.out.println("HashSet: " + hashSet);

        // Using LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(30); // Duplicate, ignored
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Using TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(60);
        treeSet.add(50); // Duplicate, ignored
        System.out.println("TreeSet: " + treeSet);
    }
}
