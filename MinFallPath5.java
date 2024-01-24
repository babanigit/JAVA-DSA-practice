import java.util.Arrays;

public class MinFallPath5 {

    public static int minFallingPathSum(int[][] A) {
        int m = A.length;
        int n = A[0].length;

        if (m == 1 || n == 1)
            return A[0][0];

        // initializing 2d dp, dp means dynamic programming
        int[][] dp = new int[m][n];

        // Loop through all rows, for knowing the data
        for (int[] row : dp)
            // converting each row as string and then printing in separate
            System.out.println(Arrays.toString(row));

        // the value of Integer.Max_VALUE = 2147483647
        // ans and dp 2d arrays element is initialize with 2147483647
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int ans = Integer.MAX_VALUE;

        // for looping
        for (int i = 0; i < A.length; ++i) {

            ans = Math.min(ans, minFallingPathSum(A, 0, i, dp));

        }

        return ans;
    }

    private static int minFallingPathSum(int[][] A, int row, int col, int[][] dp) {
        int m = A.length;
        int n = A[0].length;

        // if (dp[row][col] != Integer.MAX_VALUE)
        // return dp[row][col];

        if (row == m - 1)
            return dp[row][col] = A[row][col];

        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;

        if (col > 0) {
            System.out.println("col>0");
            left = minFallingPathSum(A, row + 1, col - 1, dp);
        }

        int straight;
        if (true) {
            System.out.println("straight");
            straight = minFallingPathSum(A, row + 1, col, dp);
        }

        if (col < n - 1) {
            System.out.println("col< n-1  \n");
            right = minFallingPathSum(A, row + 1, col + 1, dp);
        }

        System.out.println(left + " left and right " + right);
        dp[row][col] = Math.min(left, Math.min(straight, right)) + A[row][col];

        return dp[row][col];
    }

    public static void main(String[] args) {

        int[][] matrix = new int[][] {
                { 2, 1, 3 },
                { 6, 5, 4 },
                { 7, 8, 9 }

                // { -19, 57 },
                // { -40, -5 }
        };
        System.out.println("the easiest path would be : " + minFallingPathSum(matrix));

        // trail code

        // int ar[] = { 2, 2, 1, 8, 3, 2, 2, 4, 2 };
        // Arrays.fill(ar, 10);
        // System.out.println("Array completely filled" + " with 10\n" +
        // Arrays.toString(ar));
    }
}
