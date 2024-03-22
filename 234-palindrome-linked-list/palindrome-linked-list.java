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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        StringBuilder sb=new StringBuilder();
        while(temp!=null){
            sb.append(temp.val);
            temp=temp.next;
        }
        String k= sb.toString();
        sb.reverse();
        return k.equals(sb.toString());
    }
}