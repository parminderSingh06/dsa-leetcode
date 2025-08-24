public class BalancedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    boolean answer = true;
    public boolean isBalanced(TreeNode root) {
        rec(root);
        return answer;
    }

    public int rec(TreeNode root){
        if(root == null) return 0;

        int left = rec(root.left);
        int right = rec(root.right);
        
        if(Math.abs(left - right) > 1) answer = false;
        return Math.max(left,right) + 1;
    }
}
