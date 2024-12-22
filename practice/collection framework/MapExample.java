import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // Using HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(1, "Updated One"); // Overwrites the value for key 1
        System.out.println("HashMap: " + hashMap);

        // Using LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(4, "Four");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Using TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Five");
        treeMap.put(6, "Six");
        System.out.println("TreeMap: " + treeMap);
    }
}
