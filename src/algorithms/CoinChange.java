package algorithms;

import java.util.HashMap;

public class CoinChange {
    public static void main(String[] args) {
        int coins[] = {1, 3, 5, 2};
        int len = coins.length;
        int total = 7;

        int minNumber = minCoins(coins, len, total);
        int min = minCoinsTopDown(coins, len, total, new HashMap<Integer, Integer>());
        int minCoins = minCoinsBottomUp(coins, len, total);

        System.out.println("Minimum coins needed: " + minNumber + " coins");
        System.out.println("Minimum coins needed: " + min + " coins");
        System.out.println("Minimum coins needed: " + minCoins + " coins");
    }

    private static int minCoinsBottomUp(int[] coins, int len, int total) {
        int[] arr = new int[total + 1];
        arr[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.MAX_VALUE - 1;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (coins[i] <= j)

                if (1 + arr[j - coins[i]] < arr[j])
                    arr[j] = 1 + arr[j - coins[i]];
            }
        }

        return arr[total];
    }

    private static int minCoinsTopDown(int[] coins, int len, int total, HashMap<Integer, Integer> map) {

        if (total == 0) return 0;

        if (map.containsKey(total))
            return map.get(total);

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (coins[i] <= total) {
                int subResult = minCoinsTopDown(coins, len, total - coins[i], map);
                if (subResult != Integer.MAX_VALUE && subResult + 1 < result)
                    result = subResult + 1;
            }
        }
        map.put(total, result);
        return result;
    }

    private static int minCoins(int[] coins, int len, int total) {

        if (total == 0) return 0;

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (coins[i] <= total) {
                int subResult = minCoins(coins, len, total - coins[i]);
                if (subResult != Integer.MAX_VALUE && subResult + 1 < result)
                    result = subResult + 1;
            }
        }
        return result;
    }
}
