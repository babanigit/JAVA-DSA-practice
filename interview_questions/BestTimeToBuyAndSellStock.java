public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // No prices means no profit
        }

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minPrice if a lower price is found
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update maxProfit if a better profit is found
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println("The maximum profit is: " + profit);
    }
}
