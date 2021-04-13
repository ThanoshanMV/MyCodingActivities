/*
Runtime: 5 ms, faster than 91.39% of Java online submissions for Contains Duplicate II.
Memory Usage: 44.9 MB, less than 20.55% of Java online submissions for Contains Duplicate II.
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                int index = map.get(nums[i]);
                if(Math.abs(index - i) <= k){
                    return true;
                }
                else{
                    map.put(nums[i], i);
                }
            }
            else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
