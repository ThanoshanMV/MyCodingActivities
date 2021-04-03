/*
Runtime: 1 ms, faster than 93.92% of Java online submissions for Find Numbers with Even Number of Digits.
Memory Usage: 38.3 MB, less than 87.21% of Java online submissions for Find Numbers with Even Number of Digits.
*/
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
