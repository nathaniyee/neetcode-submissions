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
        int indexes = 0;
        ListNode current = head;

        while (current != null) {
            indexes++;
            current = current.next;
        }

        int indexToRemove = indexes - n;
        if (indexToRemove == 0) {
            return head.next;
        }

        current = head;
        for (int i = 0; i < indexes - 1; i++) {
            if ((i + 1) == indexToRemove) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }

        return head;
    }
}
