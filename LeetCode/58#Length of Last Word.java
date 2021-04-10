/*
Runtime: 2 ms, faster than 10.52% of Java online submissions for Length of Last Word.
Memory Usage: 39.3 MB, less than 5.21% of Java online submissions for Length of Last Word.
*/
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if(arr.length == 0){
            return 0;
        }
        else{
            return arr[arr.length-1].length();
        }
    }
}
