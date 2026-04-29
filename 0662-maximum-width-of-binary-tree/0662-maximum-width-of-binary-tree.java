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
    class Pair
    {
        TreeNode node;
        int num;
        Pair(TreeNode node, int num)
        {
            this.node=node;
            this.num=num;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int ans=0;
       if(root==null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty())
        {
            int size =q.size();
            int min =q.peek().num;
            int f=0, l=0;
            for(int i=0;i<size;i++){
                int cur=q.peek().num-min;
                TreeNode temp=q.peek().node;
                q.poll();
                if(i==0) f=cur;
                if(i==size-1) l=cur;
                if(temp.left!=null) q.offer(new Pair(temp.left,2*cur+1));
                if(temp.right!=null) q.offer(new Pair(temp.right,2*cur+2));
                
            }
            ans=Math.max(ans, (l-f)+1);
        }
        return ans;

    }
}