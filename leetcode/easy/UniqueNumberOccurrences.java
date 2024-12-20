import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOccurrences {

    public static boolean uniqueNumberOccurrences(int[] arr) {
        HashMap<Integer, Integer> hash_map = new HashMap<>();

        for (int i : arr) {
            System.out.println("the value of array value : " + i);

            // to find the occurrence
            int k = hash_map.getOrDefault(i, 0) + 1;
            System.out.println("the value of occurrence : " + k + "\n");

            // here storing data in hashmap
            hash_map.put(i, k);
        }

        System.out.println(hash_map);

        HashSet<Integer> set = new HashSet<>();

        System.out.println(" the hash_map values is " + hash_map.values());

        // System.out.println("the set is " + set);

        for (int i : hash_map.values()) {
            System.out.println("the value of i " + i);

            if (!set.contains(i))
                set.add(i);

            else
                return false;
        }
        System.out.println("the set is " + set);
        return true;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 3, 1, 2, 2, 1, 1, 2 };

        System.out.println(uniqueNumberOccurrences(arr));
    }
}
