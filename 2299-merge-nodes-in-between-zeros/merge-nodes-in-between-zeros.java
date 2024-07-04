/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode li = new ListNode();
        head = li;
        int c=0;
        while(temp != null){
            if(temp.val==0){
                li.next = new ListNode(c);
                li = li.next;
                c=0;
            }
            else{
                c+=temp.val;}
                temp=temp.next;
            
        }
        return head.next;
    }
}