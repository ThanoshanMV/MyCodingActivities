/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
Memory Usage: 36.9 MB, less than 83.33% of Java online submissions for Defanging an IP Address.
*/
class Solution {
    public String defangIPaddr(String address) {
        String result = address.replace(".", "[.]");
        return result;
    }
}
