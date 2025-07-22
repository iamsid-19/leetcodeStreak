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
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
       path(root,"");
       return list;   
    }
    public void path(TreeNode root,String str){
        if(root.left==null && root.right==null)
        {
            list.add(str+root.val);
        }
        if(root.left!=null)
        {
            path(root.left, str+root.val+"->");
        }
        if(root.right!=null)
        {
            path(root.right,str+root.val+"->");
        }
    }
}