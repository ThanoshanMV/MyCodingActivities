/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Kids With the Greatest Number of Candies.
Memory Usage: 39 MB, less than 64.67% of Java online submissions for Kids With the Greatest Number of Candies.
*/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // multiple kids can have the greatest number of candies.

        // get max candy count
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        
        List<Boolean> result = new ArrayList<>();
        
        // check if kid such that he or she can have the greatest number of candies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
}
