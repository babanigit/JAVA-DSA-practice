public class MInFallPath {

    public static int[][] dp = new int[101][101];

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
    


        return 0;
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
