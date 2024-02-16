import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeastNumberofUniqueIntegersafterKRemovals1481 {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1); // will get number of elements
        }
        System.out.println(map);
        List<HashMap.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());
        System.out.println(elements);

        elements.sort((a, b) -> a.getValue() - b.getValue()); // its just sort the values...

        System.out.println(elements);
        System.out.println();

        for (HashMap.Entry<Integer, Integer> entry : elements) {
            System.out.println(entry);

            if (entry.getValue() <= k) {
                k -= entry.getValue();
                map.remove(entry.getKey());
                System.out.println(entry +" removed");
            } else {
                break;
            }
        }

        result = map.size();

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {
                4, 3, 1, 1, 3, 3, 2
        };
        System.out.println(findLeastNumOfUniqueInts(arr, 3));
    }
}