public class DiameterbinaryTree {
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
    
    int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        rec(root);
        return diameter;
    }

    public int rec(TreeNode root){
        if(root == null) return 0;

        int left = rec(root.left);
        int right = rec(root.right);

        diameter = Math.max(diameter, left+right);

        return 1 + Math.max(left,right);
    }
}
