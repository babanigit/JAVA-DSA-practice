
import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        // Create a map of Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // Add some entries to the map
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // Iterate over the map using an enhanced for loop (foreach)
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // using forEach method
        map.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
