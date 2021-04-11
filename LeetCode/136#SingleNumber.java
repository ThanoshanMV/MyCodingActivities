/*
Runtime: 9 ms, faster than 32.50% of Java online submissions for Single Number.
Memory Usage: 39.8 MB, less than 14.55% of Java online submissions for Single Number.
*/
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], 2);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) == 1){
                System.out.println(nums[i]);
                return nums[i];
            }
        }
        return -1;
    }
}
