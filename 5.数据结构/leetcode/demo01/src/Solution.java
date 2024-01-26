public class Solution {
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
            if(list1!=null && list2!=null){
                if(list1.val<list2.val){
                    list1.next=mergeTwoLists(list1.next,list2);
                    return list1;
                }else{
                    list2.next=mergeTwoLists(list1,list2.next);
                    return list2;
                }
            }
            if (list1==null){
                return list2;
            }
            return list1;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(2,listNode);
        ListNode listNode2 = new ListNode(1,listNode1);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(3,listNode3);
        ListNode listNode5 = new ListNode(1,listNode4);
        Solution solution = new Solution();
        ListNode list1 = solution.mergeTwoLists(listNode2,listNode5);

    }
}


