/*
Runtime: 12 ms, faster than 48.78% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
Memory Usage: 38.9 MB, less than 77.63% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}