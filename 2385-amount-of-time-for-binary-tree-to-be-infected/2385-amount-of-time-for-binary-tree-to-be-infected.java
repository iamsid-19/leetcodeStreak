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
    public TreeNode func(TreeNode root, HashMap<TreeNode,TreeNode> map, int start)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode temp=null;
        while(!q.isEmpty())
        {
            int n= q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode cur = q.poll();
                if(cur.val==start)
                {
                    temp=cur;
                }
                if(cur.left!=null)
                {
                    map.put(cur.left,cur);
                    q.offer(cur.left);
                }
                if(cur.right!=null)
                {
                    map.put(cur.right,cur);
                    q.offer(cur.right);
                }
            }
        }
        return temp;
    }
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        TreeNode temp = func(root,map,start);
        Queue<TreeNode> q=  new LinkedList<>();
        HashSet<TreeNode> v= new HashSet<>();
        q.offer(temp);
        v.add(temp);
        int time =0;
        while(!q.isEmpty())
        {
          int n= q.size();
          boolean infect=false;

          for(int i=0;i<n;i++)
          {
            TreeNode cur =q.poll();
            if(cur.left!=null && !v.contains(cur.left))
            {
                  infect=true;
                  q.offer(cur.left);
                  v.add(cur.left);
            }
            if(cur.right!=null && !v.contains(cur.right))
            {
                  infect=true;
                  q.offer(cur.right);
                  v.add(cur.right);
            }
            if(map.containsKey(cur) && !v.contains(map.get(cur)))
            {
                infect=true;
                q.offer(map.get(cur));
                v.add(map.get(cur));
            }
          }
          if(infect)
          {
            time++;
          }
        }
        return time;

    }
}