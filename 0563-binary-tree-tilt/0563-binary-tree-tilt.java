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
    int max= 0;
    public int findTilt(TreeNode root) {
       func(root);
       return max;
    }
    public int func(TreeNode root)
    {
        if(root==null) return 0;
       int ls = func(root.left);
       int rs = func(root.right);
       max+=Math.abs(ls-rs);
       return ls+rs+root.val;
    }
}