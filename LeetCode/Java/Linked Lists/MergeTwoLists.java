class Solution {
    //Recursive, working
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        ListNode mergeHead;
        if(l1.val <= l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
            return mergeHead;
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
            return mergeHead;
        }
    }


}
class Solution {
    //Iterative
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode dummyHead = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                dummy.next = l1;
                l1 = l1.next;
            }
            else{
                dummy.next = l2;
                l2 = l2.next;
            }
            
            dummy = dummy.next;
        }
        if(l1 == null){
            dummy.next = l2;
        }
        if(l2 == null){
            dummy.next = l1;
        }
        return dummyHead.next;
        
        
    }
}