class Solution {
    // Two Pass Solution
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int numNodes = 1;
        ListNode node = head;
        while(node.next != null){
            numNodes++;
            node = node.next;
        }
        node = head;
        int nodeCount = numNodes - n ;
        if(nodeCount == 0){
            return head.next;
        }
        for(int i = 1; i < nodeCount; i++){
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }

    //One Pass solution, use dummy node at start
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slowPointer = dummy;
        ListNode fastPointer = dummy;
        for(int i = 0; i <= n; i ++){
            fastPointer = fastPointer.next;
        }
            
        while(fastPointer != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        return dummy.next;
    }
}