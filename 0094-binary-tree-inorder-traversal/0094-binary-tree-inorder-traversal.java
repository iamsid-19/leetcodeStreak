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
 private ArrayList<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        traverse(root);
        return ans;
        
    }
    private void traverse(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        traverse(root.left);
        ans.add(root.val);
        traverse(root.right);
    }
}