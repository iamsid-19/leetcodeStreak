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
    public int maxDepth(TreeNode root) {
        int count = helper(root,0);
        return count;
    }
    public int helper(TreeNode root,int count)
    {
        if(root==null)
        {
            return count;
        }
        return Math.max(helper(root.left,count+1), helper(root.right,count+1));
    }
}