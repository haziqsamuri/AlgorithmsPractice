/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        int length = 1;
        int slowPointer = 0;
        ListNode tail = head;
        
        
        while(tail.next != null){
            length++;
            tail = tail.next;
        }  
        int mid = length / 2;
        
        System.out.println(length);
        ListNode midNode = head;
        for(int i = 1; i <= mid; i++){
            midNode = midNode.next;
        }
        
        midNode = reverse(midNode);
        System.out.println(head.val);
        System.out.println(midNode.val);
        if(length % 2 != 0){
            midNode = midNode.next;
        }
        while(midNode != null){
            if(midNode.val != head.val){
                return false;
            }
            midNode = midNode.next;
            head = head.next;
            
        }
        return true;
        
        
        // while(slowPointer < fastPointer){
        //     if(head.val != tail.val){
        //         return false;
        //     }
        //     fastPointer++;
        //     slowPointer--;
        //     head = head.next;
        //     tail = 
        // }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return head;
    }
}