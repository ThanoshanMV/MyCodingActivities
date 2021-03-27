/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Richest Customer Wealth.
Memory Usage: 38.4 MB, less than 88.23% of Java online submissions for Richest Customer Wealth.
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int maxWealth = 0;
        for (int i=0; i<accounts.length; i++) {
            for (int j=0; j<accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
            wealth = 0;
        }
        return maxWealth; 
    }
}
