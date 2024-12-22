import java.util.Arrays; // Correct import

public class containsDuplicate217 {

    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i <= nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = new int[] {
                1, 2, 3, 1
        };

        System.out.println(containsDuplicate(nums));

        System.out.println("hello there ");

    }
}
