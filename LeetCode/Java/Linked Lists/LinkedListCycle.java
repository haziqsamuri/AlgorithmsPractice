public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head.next == null || head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast.next != null && fast.next.next != null){
            if(slow.val == fast.val){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return false;
    }
}