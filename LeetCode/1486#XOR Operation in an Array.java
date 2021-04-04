/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for XOR Operation in an Array.
Memory Usage: 36 MB, less than 15.08% of Java online submissions for XOR Operation in an Array.
*/
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2*i;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
        }
        return sum;
    }
}