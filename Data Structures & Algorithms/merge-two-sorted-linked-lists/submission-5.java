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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode dummy = head;

        ListNode one = list1;
        ListNode two = list2;

        while (one != null && two != null) {
            if (one.val <= two.val) {
                dummy.next = new ListNode(one.val);
                one = one.next;
            } else {
                dummy.next = new ListNode(two.val);
                two = two.next;
            }
            dummy = dummy.next;
        }

        if (one != null) {
            dummy.next = one;
        } else {
            dummy.next = two;
        }

        return head.next;
    }
}