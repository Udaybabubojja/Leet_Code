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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp3 = list2;
        int i=0;
        while(i++<= a-2){
            temp1 = temp1.next;
        }
        int j=a;
        ListNode temp2 = temp1;
        while( j++<= b){
            temp2 = temp2.next;
        }
        while(temp3.next != null){
            temp1.next=temp3;
            temp3=temp3.next;
            temp1=temp1.next;
        }
        temp3.next=temp2.next;
        return list1;
    }
}