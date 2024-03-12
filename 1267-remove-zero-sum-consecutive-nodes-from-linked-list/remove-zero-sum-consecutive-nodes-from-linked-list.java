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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current != null) {
            ListNode runner = current.next;
            int sum = 0;

            while (runner != null) {
                sum += runner.val;

                if (sum == 0) {
                    current.next = runner.next;
                    break;
                }

                runner = runner.next;
            }

            if (runner == null) {
                current = current.next;
            }
        }

        return dummy.next;
    }
}