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
    public ListNode oddEvenList(ListNode head) {
        ListNode k = new ListNode();
        ListNode temp1 = k;
        ListNode l = new ListNode();
        ListNode temp2 = l;
        ListNode temp = head;
        int c=0;
        while(temp != null){
            if(c==0){
                temp1.next=temp;
                temp1=temp1.next;
            }
            if(c==1){
                temp2.next=temp;
                temp2=temp2.next;
            }
            c=1-c;
            temp=temp.next;
        }
        temp2.next=null;
        temp1.next=l.next;
        return k.next;
    }
}