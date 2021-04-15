/*
Runtime: 602 ms, faster than 5.11% of Java online submissions for Count Primes.
Memory Usage: 35.5 MB, less than 97.56% of Java online submissions for Count Primes.
*/
class Solution {
    public int countPrimes(int n) {
        int count = 0; 
        for(int i = 2; i < n; i++) {
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    
    private boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        else{
            int maxFactor = (int)Math.sqrt(num);
            for(int i = 2; i <= maxFactor; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
