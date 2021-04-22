/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
Memory Usage: 39.4 MB, less than 22.22% of Java online submissions for Move Zeroes.
*/
class Solution {
    public void moveZeroes(int[] nums) {
    int temp=0,k=0;
    for(int i=0;i<nums.length;i++) {
        if(nums[i] != 0) {
            temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            k++;
        }
    }
    }
}