class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j; 
                }
            }
        }
        return result;
    }
}

// Time Complexity = O(n^2)