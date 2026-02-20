package LEETCODE;

public class DeleteMiddleNodeOfTheLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            //Approach 1: Using two pointer technique
            // if(head.next==null){
            // return head.next;
            // }

            // ListNode slow= head;
            // ListNode fast= head.next.next;

            // while(fast!=null && fast.next!= null){
            // slow= slow.next;
            // fast= fast.next.next;
            // }
            // if(slow.next!=null){
            // slow.next= slow.next.next;
            // }
            // return head;

            //Approach 2: Using count of nodes

            if (head == null || head.next == null)
                return null;
            ListNode fast = head;
            ListNode slow = head;
            ListNode Temp = null;
            while (fast != null && fast.next != null) {
                Temp = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            Temp.next = slow.next;
            return head;
        }
    }
}
