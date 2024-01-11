package easy;
import java.util.HashMap;
import java.util.Map;

class TwoSumA{

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[] { i, complementIndex };
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {
                2, 7, 11, 15, 2, 10, 7
        };
        int target = 9;

        int[] returnArr = twoSum(arr, target);

        System.err.println(returnArr);
    }

    /*
     * {5,2,4}
     * 6
     */
}