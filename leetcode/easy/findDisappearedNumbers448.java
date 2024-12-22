import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers448 {
    
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1]++;
            System.out.println( " this is arr :- " + arr[nums[i] - 1]++);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] == 0)
                ans.add(i + 1);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = new int[] {
                4, 3, 2, 7, 8, 2, 3, 1
        };

        System.out.println(findDisappearedNumbers(nums));

    }

}
