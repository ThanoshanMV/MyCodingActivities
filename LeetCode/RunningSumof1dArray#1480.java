/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
Memory Usage: 39 MB, less than 76.16% of Java online submissions for Running Sum of 1d Array.
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
