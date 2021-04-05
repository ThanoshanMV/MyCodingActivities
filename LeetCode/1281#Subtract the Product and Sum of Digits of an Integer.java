/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 36 MB, less than 24.41% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
*/
class Solution {
    public int subtractProductAndSum(int n) {
        int result = difference(n);
        return result;
    }
    
    private static int difference (int num) {
        int product = 1;
        int sum = 0;
        
        int remainder = 0;
        // contraint: n always greater than 0
        while (num > 0) {
            remainder = num % 10;
            num /= 10;
            sum += remainder;
            product *= remainder;
        }
        return product - sum;
    }
}