public class Solution{
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode tempNode = head;
        while(head.next != null){
            if(head.prev == null){
                tempNode = head.next;
                head.next = null;
                head.prev = tempNode;
            }
            else{
                tempNode = head.next;
                head.next = head.prev;
                head.prev = tempNode;
            }
            head = head.prev;
        }
        head = tempNode;
        head.next = head.prev;
        head.prev = null;
        return head;
    }
}