/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode p =head;
        while(temp!=null && temp.next != null){
            p=p.next;
            temp=temp.next.next;
            if(p==temp) return true;
        }
        return false;
    }
}