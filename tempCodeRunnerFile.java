import java.util.HashMap;

public class MajorityElement169 {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        int res = 0;
        int majority = 0;

        for (int n : nums) {

            // hash.put{key=value}
            hash.put(n, 1 + hash.getOrDefault(n, 0)); // u will get the value of "n" not he key, okkk!!!
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);

            }
            System.out.println(hash);
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {
                2, 3, 1, 1, 1, 2, 2,2
        };

        System.out.println(majorityElement(arr));
    }
}
