/*
Runtime: 4 ms, faster than 78.98% of Java online submissions for Contains Duplicate.
Memory Usage: 45.9 MB, less than 10.59% of Java online submissions for Contains Duplicate.
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int arrLength = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if(set.size() != arrLength){
            return true;
        }
        else{
            return false;
        }
    }
}
