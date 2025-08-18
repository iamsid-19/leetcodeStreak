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
    ArrayList<Integer> list =new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
         inOrder(root);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i-1)>=list.get(i))
            {
                return false;
            }
        }
        return true;
    }
    public void inOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
    
        list.add(root.val);
        inOrder(root.right);
    }
}