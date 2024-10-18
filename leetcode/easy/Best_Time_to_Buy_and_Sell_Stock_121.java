public class Best_Time_to_Buy_and_Sell_Stock_121 {

    public static int maxProfit(int[] prices) {

        int buy_Price = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (buy_Price > prices[i]) {
                buy_Price = prices[i];
            }

            profit = Math.max(profit, prices[i] - buy_Price);

        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));

    }

}
