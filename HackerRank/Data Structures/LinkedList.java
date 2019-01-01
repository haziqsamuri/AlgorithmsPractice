public class Node{
    Node next;
    int data;
    public Node(int data){
        this.data = data;
    }
    
}

public class LinkedList{
    Node head;

    public void append(int data){
        Node node = Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node current = head;
        while(current.next != null){
            node = current.next;
        }
        current.next = node;
    }
    public void prepend(int data){
        Node newHead = Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void delete(int data){
        Node current = head;
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}