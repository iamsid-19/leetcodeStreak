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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
        {
            return list;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
           
            double sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode cur = q.poll();
                
                if(cur.left!=null)
                {
                   q.offer(cur.left);
                }
                if(cur.right!=null)
                {
                    q.offer(cur.right);
                }
                sum+=cur.val;
            }
            list.add(sum/size);

        }
        return list;
        
    }
}