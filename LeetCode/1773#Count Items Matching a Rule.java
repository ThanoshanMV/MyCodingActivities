/*
Runtime: 3 ms, faster than 98.06% of Java online submissions for Count Items Matching a Rule.
Memory Usage: 44.1 MB, less than 37.44% of Java online submissions for Count Items Matching a Rule.
*/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int elementIndex = -1;
        switch(ruleKey) {
            case "type": 
                elementIndex = 0;
                break;
            case "color": 
                elementIndex = 1;
                break;
            case "name": 
                elementIndex = 2;
                break;
        }
        
        // iterate through the items
        for (List<String> item : items) {
            if (item.get(elementIndex).equals(ruleValue)) {
                result++;
            }
        }
        return result;
    }
}
