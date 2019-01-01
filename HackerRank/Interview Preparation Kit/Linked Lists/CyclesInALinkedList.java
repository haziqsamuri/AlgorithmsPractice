public class Node{
    Node next;
    int data;
    public Node(int data){
        this.data = data;
    } 
}
public class Solution{
    public boolean hasCycle(Node head){
        if(head == null){
            return false;
        }
        Node fastPointer = head.next;
        Node slowPointer = head;
        while(fastPointer != null && fastPointer.next != null && slowPointer != null){
            if(fastPointer == slowPointer){
                return true;
            }
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return false;
    }
}