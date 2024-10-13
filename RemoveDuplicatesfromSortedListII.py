# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        prev = dummy
        cur = head
        while cur != None:
            if cur.next != None and cur.val == cur.next.val:
                val = cur.val
                while cur and cur.val == val:
                    cur = cur.next
                if prev == dummy:
                    dummy.next = cur
                else:
                    prev.next = cur
            else:
                prev = cur
                cur = cur.next
        return dummy.next
        