/*
Runtime: 21 ms, faster than 8.80% of Java online submissions for Power of Three.
Memory Usage: 38.6 MB, less than 73.34% of Java online submissions for Power of Three.
*/
class Solution {
    public boolean isPowerOfThree(int n) {
       if(n == 0){
           return false;
       }
        for(int i = 0; i < 32; i++){
            if(Math.pow(3,i) == n){
                return true;
            }
        }
        return false;
    }
}
