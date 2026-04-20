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
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> tm= new TreeMap<>();
        helper(0,0,root, tm);
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
    private void helper(int r, int c, TreeNode root,TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> tm)
    {

        if(root==null) return;
        if(!tm.containsKey(c))
        {
            tm.put(c, new TreeMap<Integer,PriorityQueue<Integer>>() );
        }
        if(!tm.get(c).containsKey(r))
        {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            tm.get(c).put(r,pq);
        }
        PriorityQueue<Integer> pq = tm.get(c).get(r);
        pq.add(root.val);
        helper(r+1,c-1,root.left,tm);
        helper(r+1,c+1,root.right,tm);

    }
}