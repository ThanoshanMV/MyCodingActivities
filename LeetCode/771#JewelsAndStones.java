/*
Runtime: 1 ms, faster than 69.46% of Java online submissions for Jewels and Stones.
Memory Usage: 37 MB, less than 93.00% of Java online submissions for Jewels and Stones.
*/
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (int i=0; i<jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i=0; i<stones.length(); i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
