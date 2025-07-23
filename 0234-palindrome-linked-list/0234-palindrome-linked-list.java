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
        if(head==null)
         {
            return false;
         }
         Stack<ListNode> stk = new Stack<>();
         ListNode cur=head;
         while(cur!=null)
         {
            stk.push(cur);
            cur=cur.next;
         }
         cur=head;
         while(!stk.isEmpty() && cur!=null)
         {
            if(stk.pop().val!=cur.val)
            {
                return false;
            }
            cur=cur.next;
         }
         return true;
    }

}