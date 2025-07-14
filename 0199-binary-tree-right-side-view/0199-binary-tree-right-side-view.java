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
    List<Integer> ans = new ArrayList<>();
    int totalmax=0;
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
        {
            return ans;
        }
        List<Integer> arr = rightTravel(root,1);
        return arr;
     }
     public List<Integer> rightTravel(TreeNode root, int level){
        if(root==null)
        {
            return ans;
        }
        if(totalmax<level)
        {
            ans.add(root.val);
            totalmax=level;
        }
        rightTravel(root.right,level+1);
        rightTravel(root.left,level+1);
        return ans;
     }
}