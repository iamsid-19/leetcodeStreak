/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode cur =root,prev=null;
        TreeNode temp = new TreeNode(val);
        if(root==null)
        {

            return temp;
        }
        while(cur!=null)
        {
           prev=cur;
           if(val>cur.val)
           {
              cur=cur.right;
           }
           else{
            cur=cur.left;
           }
        }
       if(cur==null && prev.val>val)
       {
         prev.left=temp;
       }
       else{
        prev.right=temp;
       }
       return root;
    }
}