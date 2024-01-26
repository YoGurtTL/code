# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
      if l1 is None:
          return l2
      if l2 is None:
          return l1
      l1.val +=l2.val
      if l1.val>=10:
          l1.next=self.addTwoNumbers(ListNode(l1.val//10),l1.next)
          l1.val %=10
      l1.next=self.addTwoNumbers(l1.next,l2.next)
      return l1
s = Solution()
l1=ListNode(3)
l2=ListNode(4,l1)
l3=ListNode(2,l2)
l4=ListNode(4)
l5=ListNode(6,l4)
l6=ListNode(5,l5)
l7 = s.addTwoNumbers(l3,l6)
print(l7)