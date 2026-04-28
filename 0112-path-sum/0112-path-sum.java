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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean ans = fun(root,targetSum);
        return ans;
    }
    private boolean fun(TreeNode root, int t)
    {
       if(root==null)
       {
          return false;
       }
      if(root.left==null && root.right==null)
      {
        return t==root.val;
      }
       
       boolean a = fun(root.left,t-root.val);
       boolean b = fun(root.right,t-root.val);
       
       return a||b;
    }
}