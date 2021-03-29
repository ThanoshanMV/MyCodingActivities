/*
Runtime: 1 ms, faster than 66.69% of Java online submissions for Number of Good Pairs.
Memory Usage: 36.1 MB, less than 85.13% of Java online submissions for Number of Good Pairs.
*/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numOfPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    numOfPairs++;
                }
            }
        }
        return numOfPairs;
    }
}

// NOTE: Complexity can be improved. I will add that later