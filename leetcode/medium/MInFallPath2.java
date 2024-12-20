// import java.util.Arrays;

public class MInFallPath2 {

    public static int minFallingPathSum(int[][] A) {

        int r = A.length; // 3
        int c = A[0].length; // 3
        int ans = Integer.MAX_VALUE; // 2147483647

        for (int i = 0; i < c; i++)

            ans = Math.min(ans, rec(0, i, A));
        return ans;
    }

    private static int rec(int j, int i, int[][] arr) {

        // i =0

        int r = arr.length; // 3
        int c = arr[0].length; // 3

        if (j == r)
            return 0;

        if (i < 0 || i >= c) {
            // System.out.println("its running");
            return Integer.MAX_VALUE;

        }

        int op1 = rec(j + 1, i + 1, arr);
        int op2 = rec(j + 1, i, arr);
        int op3 = rec(j + 1, i - 1, arr);

        // int min1 = Math.min(op2, op3);
        // int min2 = Math.min(op1, min1);

        // return arr[j][i] + min2;

        return arr[j][i] + Math.min(op1, Math.min(op2, op3));
    }

    public static void main(String[] args) {

        int[][] matrix = new int[][] {
                { 2, 1, 3 },
                { 6, 5, 4 },
                { 7, 8, 9 }
        };

        System.out.println(minFallingPathSum(matrix));
    }
}
