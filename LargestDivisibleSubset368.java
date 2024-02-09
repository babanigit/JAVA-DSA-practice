import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestDivisibleSubset368 {
    static List<Integer> result = new ArrayList<>();

    public static List<Integer> largestDivisibleSubset (int[] nums) {

        int n = nums.length;
        if(n==0) return new ArrayList<>();

        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] pi = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(pi, -1);

        int maxi = 0;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    pi[i] = j;
                    if (dp[i] > dp[maxi])
                        maxi = i;
                }
            }
        }


        List<Integer> result = new ArrayList<>();
        while (maxi >= 0) {
            result.add(nums[maxi]);
            maxi = pi[maxi];
        }
        
        Collections.reverse(result);
        return result;
    }


    public static void main(String[] args) {
        
        int[] arr = new int[] {
            1,2,4,8
        };
        
        
        System.out.println( largestDivisibleSubset(arr));
    }
}
