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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(getTheNumber(l1));
        System.out.println(getTheNumber(l2));
        BigInteger sum = getTheNumber(l1).add(getTheNumber(l2));
        System.out.println(sum);
        
        return makeListNode(sum);
    }
    
    public static BigInteger getTheNumber(ListNode l1) {
        String stringNumber = "";
        String reverseNum = "";
        while (l1 != null) {
            stringNumber += String.valueOf(l1.val);
            l1 = l1.next;
        }
        reverseNum = new StringBuilder(stringNumber).reverse().toString();
        BigInteger integer = new BigInteger(reverseNum);
        return integer;
    }
    
    public static ListNode makeListNode(BigInteger number) {
        String stringNum = String.valueOf(number);
        String reverseNum = new StringBuilder(stringNum).reverse().toString();
        
        ListNode result = new ListNode(Integer.parseInt(String.valueOf(reverseNum.charAt(0))));
        ListNode l = result;
        int val = 0;
        // we have correct string. need to make list of each char in int value
        for (int i = 1; i < reverseNum.length(); i++) {
            val = Integer.parseInt(String.valueOf(reverseNum.charAt(i)));
            l.next = new ListNode(val);
            l = l.next;
        }
        return result;
    }
}
