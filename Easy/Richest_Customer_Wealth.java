package Easy;

public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int[] account : accounts){// for each account
            int wealth = 0;
            for(int moneySum : account){// for each money sum in account 
                wealth += moneySum;// sum of money in each account
            }
            maxWealth = Math.max(maxWealth, wealth);// max wealth of all accounts
        }
        return maxWealth;
    }

    public int maximumWealth2(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int wealthSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealthSum += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, wealthSum);
        }
        return maxWealth;
    }
}
