public class Buy_sell_Stocks {
    public static int maxStockProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // Profit
                int profit = prices[i] - buyPrice;  // Today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
     int arr[] = {7,1,5,3,6,4};
    int maxPROFIT = maxStockProfit(arr);
        System.out.println(maxPROFIT);
    }
}
