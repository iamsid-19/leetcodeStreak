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
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> tm = new TreeMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(root,tm, 0 ,0);
        for(Integer outer: tm.keySet())
        {
            List<Integer> arr = new ArrayList<>();
            TreeMap<Integer, PriorityQueue<Integer>> t = tm.get(outer);
            for(Integer inner: t.keySet())
            {
                PriorityQueue<Integer> pq = t.get(inner);
                while(!pq.isEmpty())
                {
                    arr.add(pq.poll());
                }
               
            }
             ans.add(arr);
        }
        return ans;
    }
    public void helper( TreeNode root,  TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>tm ,int row ,int col)
    {
        if(root==null) return;
        if(!tm.containsKey(col))
        {
            tm.put(col, new TreeMap<Integer,PriorityQueue<Integer>>());
        }
        if(!tm.get(col).containsKey(row))
        {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            tm.get(col).put(row,pq);
        }
        PriorityQueue<Integer> pq = tm.get(col).get(row);
        pq.add(root.val);
        
        helper(root.left , tm , row+1, col -1);
        helper(root.right , tm , row+1, col +1);
    }
}