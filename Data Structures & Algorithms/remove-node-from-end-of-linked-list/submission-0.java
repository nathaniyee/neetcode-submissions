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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        int position = length - n; //index where we need to remove
        if (position == 0) { //first one
            return head.next;
        }
        else if (position == length) { //last one
            ListNode first = head;
            while (first.next != null) {
                first = first.next;
            }
            first.next = null;
            return head;
        }
        else { //in the middle
            ListNode node = head;
            int pos = 0;
            while (pos != position - 1) {
                pos++;
                node = node.next;
            }
            node.next = node.next.next;
            return head;
        }
    }
}
