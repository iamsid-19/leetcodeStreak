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
    public List<Integer> postorderTraversal(TreeNode root) {
        traversal(root);
        return ans;
    }
    private void traversal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        traversal(root.left);
        traversal(root.right);
        ans.add(root.val);
    }
}