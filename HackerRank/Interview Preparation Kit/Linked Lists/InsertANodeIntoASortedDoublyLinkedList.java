public class Solution{
    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode current = head;
        DoublyLinkedListNode nodeToInsert = new DoublyLinkedListNode(data);
        if(head == null){
            return nodeToInsert;
        }
        if(head.data > data){
            head.prev = nodeToInsert;
            nodeToInsert.next = head;
            head = nodeToInsert;
            return head;
        }
        while(current.next != null && current.next.data < data){
            current = current.next;
        }
        if(current.next != null){
            nodeToInsert.next = current.next;
            current.next.prev = nodeToInsert;
        }
        nodeToInsert.prev = current;
        current.next = nodeToInsert;

        return head;

    }
}