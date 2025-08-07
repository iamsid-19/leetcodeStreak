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
    public int diameterOfBinaryTree(TreeNode root) {
      if(root==null)
      {
        return 0;
      }   
      int lt = helper(root.left);
      int rt =helper(root.right);
      return Math.max(lt+rt,Math.max( diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }
    public int helper(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(helper(root.left),helper(root.right))+1;
    }
}