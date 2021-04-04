/*
Runtime: 9 ms, faster than 79.17% of Java online submissions for Count the Number of Consistent Strings.
Memory Usage: 39.6 MB, less than 77.10% of Java online submissions for Count the Number of Consistent Strings.
*/
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0; 
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        
        boolean unique = true;
        for (String word : words) {
            unique = true;
            for (int i = 0; i < word.length(); i++) {
                if (!set.contains(word.charAt(i))) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                count++;
            }
        }
        return count;
    }
}