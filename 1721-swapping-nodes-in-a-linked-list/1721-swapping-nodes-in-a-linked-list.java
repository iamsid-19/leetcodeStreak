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
    public ListNode swapNodes(ListNode head, int k) {
       ArrayList<ListNode> arr = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }

        int n = arr.size();
        ListNode first = arr.get(k - 1);
        ListNode second = arr.get(n - k);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    
    }
}