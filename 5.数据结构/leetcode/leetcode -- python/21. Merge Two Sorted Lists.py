class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1, list2):
        newHead = dummyHead = ListNode()
        while list1 and list2:
            if list1.val <list2.val:
                   dummyHead.next= list1
                   list1 = list1.next
            else:
                   dummyHead.next=list2
                   list2 = list2.next
            dummyHead=dummyHead.next
        if list1:
            newHead.next=list1
        if list2:
            newHead.next=list2

solution = Solution()
listnode=ListNode(4)
listnode1=ListNode(2,listnode)
listnode2=ListNode(1,listnode1)
listnode3=ListNode(4)
listnode4=ListNode(3,listnode3)
listnode5=ListNode(1,listnode4)

solution.mergeTwoLists(listnode2, listnode5)
