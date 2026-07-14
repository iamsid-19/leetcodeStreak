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
        TreeNode prev=null, cur=root;
        TreeNode t= new TreeNode(val);
        if(root==null)
        return t;
        while(cur!=null)
        {
            prev=cur;
            if(cur.val<val)
            cur=cur.right;
            else
            cur=cur.left;
        }
        if(cur==null && prev.val>val)
        prev.left=t;
        else
        prev.right=t;
        return root;
    }
}