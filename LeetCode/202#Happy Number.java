/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Happy Number.
Memory Usage: 35.5 MB, less than 96.13% of Java online submissions for Happy Number.
*/
class Solution {
    public boolean isHappy(int n) {
        // if the number is i then it's a happy number
        if (n == 1){
            return true;
        }
        // all numbers below 6 are not happy except for 1. We checked 1 for earlier, no need to check again
        if (n < 6){
            return false;
        }
        // get new number till number = 1 or below 6
        int remainder = 0;
        int sum = 0;
        while(n > 0){
            remainder = n % 10;
            sum += remainder * remainder;
            n /= 10;
        }
        return isHappy(sum);
    }
}