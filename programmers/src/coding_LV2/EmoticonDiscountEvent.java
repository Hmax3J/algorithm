package coding_LV2;

import java.util.*;

public class EmoticonDiscountEvent {
    private static final int[] DISCOUNTS = {10, 20, 30, 40};
    private static int maxSubscribers = 0;
    private static int maxRevenue = 0;

    private static void dfs(int depth, int[][] users, int[] emoticons, int[] discountRates) {
        if (depth == emoticons.length) {
            calculate(users, emoticons, discountRates);
            return;
        }

        for (int discount : DISCOUNTS) {
            discountRates[depth] = discount;
            dfs(depth + 1, users, emoticons, discountRates);
        }
    }

    private static void calculate(int[][] users, int[] emoticons, int[] discountRates) {
        int subscribers = 0;
        int revenue = 0;

        for (int[] user : users) {
            int requiredRate = user[0];
            int priceLimit = user[1];

            int totalCost = 0;

            for (int i = 0; i < emoticons.length; i++) {
                if (discountRates[i] >= requiredRate) {
                    totalCost += emoticons[i] * (100 - discountRates[i]) / 100;
                }
            }

            if (totalCost >= priceLimit) {
                subscribers++;
            } else {
                revenue += totalCost;
            }
        }

        if (subscribers > maxSubscribers) {
            maxSubscribers = subscribers;
            maxRevenue = revenue;
        } else if (subscribers == maxSubscribers) {
            maxRevenue = Math.max(maxRevenue, revenue);
        }
    }

    public int[] solution(int[][] users, int[] emoticons) {
        int m = emoticons.length;
        int[] discountRates = new int[m];

        dfs(0, users, emoticons, discountRates);

        return new int[]{maxSubscribers, maxRevenue};
    }
}
