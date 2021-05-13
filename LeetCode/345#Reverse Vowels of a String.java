/*
Runtime: 9 ms, faster than 22.28% of Java online submissions for Reverse Vowels of a String.
Memory Usage: 39.9 MB, less than 24.28% of Java online submissions for Reverse Vowels of a String.
*/
class Solution {
public String reverseVowels(String s) {
    Stack<Character> stack = new Stack<>();

    for (Character c : s.toCharArray()) {
        if (isVowel(Character.toLowerCase(c))) {
            stack.add(c);
        }
    }

    StringBuilder sb = new StringBuilder();
    for (Character c : s.toCharArray()) {
        if (isVowel(Character.toLowerCase(c))) {
            sb.append(stack.pop());
        } else {
            sb.append(c);
        }
    }

    return sb.toString();
}

private boolean isVowel(Character c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}
}
