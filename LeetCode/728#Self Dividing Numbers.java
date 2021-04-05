/*
Runtime: 1 ms, faster than 99.68% of Java online submissions for Self Dividing Numbers.
Memory Usage: 36.7 MB, less than 61.11% of Java online submissions for Self Dividing Numbers.
*/
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        // bound will be left to right
        List<Integer> selfDividingNumbers = new ArrayList<>();
        
        while (left <= right) {
            if (isSelfDividingNumber(left)) {
                selfDividingNumbers.add(left);
            }
            left++;
        }
        return selfDividingNumbers;
    }
    
    private boolean isSelfDividingNumber(int num) {
        int number = num;
        int originalNumber = num;

        // let's identify self-dividing number in a reverse order like we reverse a number
        int remainder = 0;
        
        // get it's digits
        while (num > 0) {
            remainder = num % 10;
            if (0 == remainder || originalNumber % remainder != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
