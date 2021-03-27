/*
Runtime: 5 ms, faster than 20.85% of Java online submissions for Missing Number.
Memory Usage: 39.3 MB, less than 54.77% of Java online submissions for Missing Number.
*/
class Solution {
    public int missingNumber(int[] nums) {
        int arrayLength = nums.length;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i=0; i<arrayLength; i++) {
            set.add(nums[i]);
        }
        
        for (int i=0; i<=arrayLength; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
	}
}
