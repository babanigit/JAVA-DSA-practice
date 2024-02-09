
/**
 * PerfectSquares279
 */

public class PerfectSquares279 {

    public static int numSquares(int n) {
        return solve(n);
    }

    public static int solve(int n) {
        int[] memo = new int[] {};

        if (n == 0)
            return 0;
        if (n < 0)
            return Integer.MAX_VALUE;

        if (memo[n] != -1)
            return memo[n];
        int ans = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            ans = Math.min(
                    ans,
                    1 + solve(n - (i * i)));
        }

        return memo[n] = ans;
    }

    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }

}