/*
Runtime: 2 ms, faster than 57.62% of Java online submissions for Perfect Number.
Memory Usage: 35.6 MB, less than 81.42% of Java online submissions for Perfect Number.
*/
class Solution {
    public boolean checkPerfectNumber(int num) {
        // num > 0
        // num == sum of its positive divisors excluding itself.
        int originalNum = num;
        if (originalNum < 0){
            return false;
        }
        int sum = getSumOfPositiveDivisors(originalNum);
        System.out.println(sum);
        if (sum == originalNum) {
            return true;
        }
        else {
            return false;
        }
    }
    
    private int getSumOfPositiveDivisors(int num) {
        int sum = 0;
        int divisor = 0;
        int squareRoot = (int)Math.sqrt(num);
        for(int i = 1; i <= squareRoot; i++) {
            if (num % i == 0 && i != num) {
                sum += i;
                // i is a factor of num and we need to get its pair too as it's also a factor of num
                divisor = num / i;
                if (divisor != num && divisor != i) {
                    sum += divisor;
                }
            }
        }
        return sum;
    }
}
