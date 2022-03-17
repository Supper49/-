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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast = head;
            ListNode slow = head;
            int step = n;
            while (step != 0) {
                
                fast = fast.next;
                step = step-1;
                System.out.println("head:"+head.val+head.next.val+head.next.next.val+head.next.next.next.val);
                
            }
            
            if(fast ==null) {
                return head.next;
            }
            fast=fast.next;
            System.out.println("head:"+head.val+head.next.val+head.next.next.val+head.next.next.next.val);
            while (fast!=null) {
                fast =fast.next;
                slow =slow.next;
            }
            System.out.println("head:"+head.val+head.next.val+head.next.next.val+head.next.next.next.val);
            slow.next = slow.next.next;
            System.out.println("head:"+head.val+head.next.val+head.next.next.val+head.next.next.next.val);
            return head;

        }
}
