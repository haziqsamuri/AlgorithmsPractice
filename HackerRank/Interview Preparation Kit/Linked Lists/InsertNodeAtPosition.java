public class Solution{
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;
        int numNodes = 1;
        if(position == 0){
            node.next = head;
            head = node;
            return head;
        }
        while(numNodes < position){
            current = current.next;
            numNodes++;
        }
        node.next = current.next;
        current.next = node;
        return head;
    }
}