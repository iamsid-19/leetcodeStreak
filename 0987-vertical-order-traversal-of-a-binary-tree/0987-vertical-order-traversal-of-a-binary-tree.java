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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeNode<Integer,TreeNode<Integer,PriorityQueue<Integer> pq = new PriorityQueue<>()>>tm = new TreeNode<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(root,tm, 0 ,0);
    }
    public void helper( TreeNode root,  TreeNode<Integer,TreeNode<Integer,PriorityQueue<Integer> pq = new PriorityQueue<>()>>tm ,int row ,int col)
    {
        if(root==null) return;
        if(!tm.containsKey(col))
        {
            tm.put(col, new TreeNode<Integer,PriorityQueue<Integer>);
        }
        if(!tm.get(col).containsKey(row))
        {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            tm.get(col).put(row,pq);
        }
        PriorityQueue<Integer> pq = tm.get(col).get(row);
        pq.add(root.val);
        
        helper(root.left , tm , left-1, right +1);
    }
}