/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
Memory Usage: 35.8 MB, less than 81.50% of Java online submissions for Add Digits.
*/
class Solution {
    public int addDigits(int num) {
        // if num less than 10 then it'll have one digit
        if (num < 10) {
            return num;
        }
        int sum = 0; 
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        // recursively call addDigits till we reach single digit
        return addDigits(sum);
    }
}
