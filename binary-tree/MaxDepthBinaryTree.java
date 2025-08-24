public class MaxDepthBinaryTree {
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
    
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return rec(root);
    }

    public int rec(TreeNode root){
        if(root == null) return 0;

        int leftSide = rec(root.left) +1;
        int rightSide = rec(root.right) +1;

        return Math.max(leftSide, rightSide);
    }
}
