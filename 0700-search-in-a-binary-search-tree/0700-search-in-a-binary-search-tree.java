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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val>val)
        {
            TreeNode temp = searchBST(root.left,val);
            return temp;
        }
        if(root.val==val)
        {
            return root;
        }
        else{
            TreeNode temp = searchBST(root.right,val);
            return temp;
        }
    }
}