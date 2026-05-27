/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        //1. mapparents
        mapParents(root, map);

        //2. 
        return trav(target, map, k);
    }
    private void mapParents(TreeNode root, HashMap<TreeNode, TreeNode> map)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode node = q.poll();
            if(node.left!=null)
            {
                q.offer(node.left);
                map.put(node.left,node);
            }
             if(node.right!=null)
            {
                q.offer(node.right);
                map.put(node.right,node);
            }

        }
    }
    private List<Integer> trav(TreeNode target,Map<TreeNode, TreeNode> map, int k )
    {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> v = new LinkedList<>();
        q.offer(target);
        v.offer(target);
        int level =0;
        while(!q.isEmpty())
        {
            int size=q.size();
            if(level++==k) break;
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                 // Explore left child
                if (node.left != null && !v.contains(node.left)) {
                    v.add(node.left);
                    q.offer(node.left);
                }

                // Explore right child
                if (node.right != null && !v.contains(node.right)) {
                    v.add(node.right);
                    q.offer(node.right);
                }

                // Explore parent from map
                if (map.containsKey(node) && !v.contains(map.get(node))) {
                    v.add(map.get(node));
                    q.offer(map.get(node));
                }
            }
        }
         List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            result.add(q.poll().val);
        }

        return result;
    }
}