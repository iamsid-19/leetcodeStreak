class Solution {
    List<Integer> list = new ArrayList<>();
    
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        
        inorder(root); 
        
        int s = 0, e = list.size() - 1;
        
        while(s < e) {
            int sum = list.get(s) + list.get(e);
            if(sum == k) {
                return true;
            } else if(sum > k) {
                e--;
            } else {
                s++;
            }
        }
        
        return false;
    }
    
    public void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
