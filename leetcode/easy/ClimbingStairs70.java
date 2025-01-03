// package easy;

public class ClimbingStairs70 {

    public static int ClimbingStairs(int n) {

        if (n == 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            System.out.println(" println:- " + i + " - " + dp[i]);
        }
        return dp[n];
    }

    public static void main(String[] args) {

        int n = 7;
        System.out.println(ClimbingStairs(n));

    }
}
