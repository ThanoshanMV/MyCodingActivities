/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
Memory Usage: 38.5 MB, less than 33.67% of Java online submissions for Delete Node in a Linked List.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while(node.next.next != null){
            node.val = node.next.val;
            node = node.next;
        }
        // node.next is a tail node
        // copy value from the tail node
        node.val = node.next.val;
        // remove tail node
        node.next = null;
    }
}
