/*
Runtime: 10 ms, faster than 5.88% of Java online submissions for Convert Binary Number in a Linked List to Integer.
Memory Usage: 36.7 MB, less than 16.36% of Java online submissions for Convert Binary Number in a Linked List to Integer.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        List<Integer> binaryValue = getBinaryNumber(head);
        int decimalValue = getDecimalNumber(binaryValue);
        return decimalValue;
    }
    
    private List<Integer> getBinaryNumber(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while(head != null){
            result.add(head.val);
            head = head.next;
        }
        System.out.println(result.toString());
        return result;
    }
    
    private int getDecimalNumber(List<Integer> binaryValue) {
        int result = 0;
        int length = binaryValue.size();
        int j = 0;
        for(int i = length-1; i >= 0; i--) {
            result += binaryValue.get(i) * Math.pow(2,j);
            System.out.println(binaryValue.get(i) * Math.pow(2,j));
            j++;
        }
        return result;
     }
}