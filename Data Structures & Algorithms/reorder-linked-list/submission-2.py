# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head or not head.next:
            return

        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        second_half = slow.next
        slow.next = None

        prev = None
        curr = second_half
        while curr:
            next_n = curr.next
            curr.next = prev
            prev = curr
            curr = next_n
        second_half_reversed = prev

        first = head
        second = second_half_reversed
        while second:
            temp1 = first.next
            temp2 = second.next
            first.next = second
            second.next = temp1
            first = temp1
            second = temp2

