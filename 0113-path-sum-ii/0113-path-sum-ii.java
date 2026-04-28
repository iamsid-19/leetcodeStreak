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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        fun(root,targetSum,list);
        return ans;
    }
    private void fun(TreeNode root, int t, List<Integer> list)
    {
        if(root==null) return;
        list.add(root.val);
        if(root.left ==null && root.right==null)
        {
          if(t==root.val)
          {
           
            ans.add(new ArrayList<>(list));
          }
         
        }
        
        fun(root.left,t-root.val,list);
        fun(root.right,t-root.val,list);
        list.remove(list.size()-1);
    }
}