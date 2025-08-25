

public class SameTree {

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        rec(p,q);
        return answer;
    }

    public void rec(TreeNode p, TreeNode q){
        if(p == null && q == null) return;
        if((p == null && q != null) || (p != null && q == null)){
            answer = false;
            return;
        }
        rec(p.left,q.left);
        rec(p.right,q.right);
        if(p.val != q.val) answer = false;
    }
}
