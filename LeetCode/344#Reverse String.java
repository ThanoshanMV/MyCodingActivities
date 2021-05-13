/*
Runtime: 1 ms, faster than 94.68% of Java online submissions for Reverse String.
Memory Usage: 46.3 MB, less than 16.13% of Java online submissions for Reverse String.
*/
class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tempChar = s[i];
			s[i] = s[s.length - i - 1];
			s[s.length - i - 1] = tempChar;
        }
    }
}
