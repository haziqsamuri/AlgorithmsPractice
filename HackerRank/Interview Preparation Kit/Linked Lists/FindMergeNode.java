public class Solution{

    //Original solution, O(n^m);
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2){
        SinglyLinkedListNode head1Copy = head1;

        while(head2 != null){
            // System.out.printf("Forst 2 = %d, \n", head2.data);
            while(head1 != null){
                // System.out.printf("1 = %d, 2 = %d, \n",head1.data, head2.data);
                // System.out.printf("data 1 = %d, 2 = %d, \n",head1.next.data, head2.next.data);
                if(head1 == head2){
                    return head1.data;
                }
                head1 = head1.next;
            }
            head1 = head1Copy;
            head2 = head2.next;
        }
        return 0;

    }

    //Optimal solution O(m + n)
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2){
        SinglyLinkedListNode firstPointer = head1;
        SinglyLinkedListNode secondPointer = head2;
        
        while(firstPointer != secondPointer){
            if(firstPointer.next == null){
                firstPointer = head2;
            }
            else{
                firstPointer = firstPointer.next;
            }
            if(secondPointer.next == null){
                secondPointer = head1;
            }
            else{
                secondPointer = secondPointer.next;
            }
        }
        return firstPointer.data;
    }
}