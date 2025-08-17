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
    Queue<TreeNode> q = new LinkedList<>();
    ArrayList<Integer> list =  new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
     ArrayList<Integer> arr = new ArrayList<>();
      arr = helper(root);
      Collections.sort(arr);
      int temp=0;
      for(int i=0;i<k;i++)
      {
        temp =arr.get(i);
      }     
      return temp;
        
    }
    public ArrayList<Integer> helper(TreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            int size= q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode cur =q.poll();
                 list.add(cur.val);
                if(cur.left!=null)
                {
                   q.add(cur.left);
                }
                if(cur.right!=null)
                {
                    q.add(cur.right);
                }
            }
           
        }
         return list;
    }
}