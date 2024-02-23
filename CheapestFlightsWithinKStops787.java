import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheapestFlightsWithinKStops787 {

    public static int findCheapestPrice(int n, int[][] a, int src, int dst, int k) {
        List<List<List<Integer>>> graph = new ArrayList<>();
        int i, m = a.length;
        for (i = 0; i < n; i++)
            graph.add(new ArrayList<>());
            System.err.println(graph);
        for (i = 0; i < m; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(a[i][1]);
            tmp.add(a[i][2]);
            graph.get(a[i][0]).add(tmp);
        }
        int dp[][] = new int[n][k + 2];
        for (int it[] : dp) {
            Arrays.fill(it, -1);

        };
            
        System.out.println("hello");
        int ans = dfs(graph, src, dst, k + 1, dp);
        System.out.println("hello2");
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static int dfs(List<List<List<Integer>>> graph, int src, int dst, int k, int dp[][]) {
        if (k < 0)
            return Integer.MAX_VALUE;
        if (src == dst)
            return 0;
        if (dp[src][k] != -1)
            return dp[src][k];
        int min = Integer.MAX_VALUE;


        for (List<Integer> it : graph.get(src)) {
            int cho = it.get(0);
            int price = it.get(1);

            int cheap = dfs(graph, cho, dst, k - 1, dp);

            if (cheap != Integer.MAX_VALUE)
                min = Math.min(min, cheap + price);
        }

        return dp[src][k] = min;
    }

    public static void main(String[] args) {

        int[][] arr = new int[][] {
                { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 }
        };

        System.err.println(findCheapestPrice(4, arr, 0, 3, 1));
    }
}
