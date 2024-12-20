import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOccurrences2 {

    public static boolean uniqueNumberOccurrences(int[] arr) {
        HashMap<Integer, Integer> obj = new HashMap<>();

        for (int num : arr) {
            // int key and int value
            obj.put(num, obj.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> val = new HashSet<>(obj.values());
        return obj.size() == val.size();
    }

}
