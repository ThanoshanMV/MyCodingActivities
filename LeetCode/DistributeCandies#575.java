/*
Runtime: 23 ms, faster than 88.93% of Java online submissions for Distribute Candies.
Memory Usage: 41.4 MB, less than 15.66% of Java online submissions for Distribute Candies.
*/
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int candiesToEat = candyType.length / 2;
        
        for (int i = 0; i < candyType.length; i++) {
            if (set.size() == candiesToEat) {
                break;
            }
            if (!set.contains(candyType[i])) {
                set.add(candyType[i]);
            } 
        }
        return set.size();
    }
}
