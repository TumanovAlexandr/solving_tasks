package test_task;

public class App04 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitDynamic(prices));
    }

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;

        int lsf = Integer.MAX_VALUE;
        int pist = 0;
        int op = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }

    public static int maxProfitDynamic(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        return getMaxProfit(prices);
    }

    public static int getMaxProfit(int[] prices) {
        int minStockPrice = Integer.MAX_VALUE, maxDiff = 0;
        for (int i = 0; i < prices.length; i++) {
            int earn = prices[i] - minStockPrice;
            maxDiff = Math.max(earn, maxDiff);
            minStockPrice = Math.min(minStockPrice, prices[i]);
        }
        return maxDiff;
    }
}
