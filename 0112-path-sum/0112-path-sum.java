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
    public boolean hasPathSum(TreeNode root, int k) {
        if(root==null)
        {
            return false;
        }
        if( root.left==null && root.right==null)
        {
            return k==root.val;
        }
      
        return hasPathSum(root.left,k-root.val) || hasPathSum(root.right,k-root.val);
    }
}