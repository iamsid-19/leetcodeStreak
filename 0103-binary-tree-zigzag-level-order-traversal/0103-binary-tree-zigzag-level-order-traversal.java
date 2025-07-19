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
    Queue<TreeNode> q = new LinkedList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if (root == null) {
            return ans;
        }
        q.add(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                
                TreeNode cur = q.poll();

                if (flag)
                   list.addLast(cur.val);
                   else
                   list.addFirst(cur.val);
;
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }

            }

            ans.add(list);
            flag = !flag;
        }
        return ans;

    }
}