/*
Runtime: 24 ms, faster than 6.99% of Java online submissions for Palindrome Number.
Memory Usage: 38.1 MB, less than 91.53% of Java online submissions for Palindrome Number.
*/
class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversedNum = reversedNumber(x);
        if (original == reversedNum) {
            return true;
        }
        else {
            return false;
        }
    }
    public int reversedNumber(int num) {
        int remainder = 0, quotient = 0, reversedNum = 0;
        while (num > 0) {
            remainder = num % 10;
            quotient = num / 10;
            reversedNum = reversedNum * 10 + remainder;
            num = quotient;
        }
        System.out.println(reversedNum);
        return reversedNum;
    }
}