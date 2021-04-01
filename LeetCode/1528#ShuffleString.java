/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Shuffle String.
Memory Usage: 39.4 MB, less than 32.79% of Java online submissions for Shuffle String.
*/
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] array = s.toCharArray();
        char[] result = new char[s.length()];
        for (int i=0; i<array.length; i++){
            result[indices[i]] = array[i];
        }
        return String.valueOf(result);
    }
}
