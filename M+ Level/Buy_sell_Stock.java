public class Buy_sell_Stock {

    public static int stoCks(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maximumProfit = 0;

        for (int i =0;i<price.length;i++) {
            if (buyPrice<price[i]) { //profit
             int profit = price[i] - buyPrice;
             maximumProfit = Math.max(maximumProfit, profit);
            }
            else  {
                buyPrice = price[i];
            }
        }
        return maximumProfit;
    }
    public static int maxStockProfit(int price[] ) {  // best Approch
        int minbuyPrice = price[0];
        int maxProfit = 0;
        for (int i =0;i<price.length;i++) {
            minbuyPrice = Math.min(minbuyPrice,price[i]);
            int profit = price[i] - minbuyPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
int price[] = {7,1,5,3,6,4};
        System.out.println(stoCks(price));
        System.out.println(maxStockProfit(price));


    }
}
