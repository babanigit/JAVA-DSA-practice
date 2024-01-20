import java.util.Arrays;

public class MInFallPath {

   public static int minFallingPathSum(int[][] A) {
    final int n = A.length;

    for (int i = 1; i < n; ++i)

      for (int j = 0; j < n; ++j) {
    
        int min = Integer.MAX_VALUE;
    
        for (int k = Math.max(0, j - 1); k < Math.min(n, j + 2); ++k)
    
        min = Math.min(min, A[i - 1][k]);
        A[i][j] += min;
      }

    return Arrays.stream(A[n - 1]).min().getAsInt();
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
