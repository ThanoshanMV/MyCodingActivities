/*
Runtime: 1 ms, faster than 89.19% of Java online submissions for Decompress Run-Length Encoded List.
Memory Usage: 39.8 MB, less than 19.88% of Java online submissions for Decompress Run-Length Encoded List.
*/
class Solution {
    public int[] decompressRLElist(int[] nums) {
        // get length of the new array; 
        int len = 0;
        for(int i=0 ;i<nums.length; i=i+2) {
            len += nums[i];
        };
        
        // set new array; 
        int[] result = new int[len];
        int count = 0;
        
        // push element into the new array; 
        for(int i=0 ;i<nums.length; i=i+2) {
            
            // repeat element freq times; 
            int freq = nums[i];            
            for(int j=0; j<freq; j++) {
                result[count] = nums[i+1];
                count++;
            }
        }        
        return result;
    }
}
