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
    public int pairSum(ListNode head) {
        int c=0 ,k=0;
        ListNode temp = head;
        while(temp!= null){
            temp=temp.next;
            c++;
        }
        temp = head;
        int a[] = new int[c];
        while(temp != null){
            a[k++]=temp.val;
            temp=temp.next;
        }
        k=0;
        for(int i=0; i<c/2; i++){
            k=Math.max(k,a[i]+a[c-i-1]);
        }
        return k;
    }
}