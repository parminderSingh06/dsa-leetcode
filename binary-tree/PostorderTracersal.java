import java.util.ArrayList;
import java.util.List;

public class PostorderTracersal {

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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();

        recursion(answer, root);

        return answer;
    }

    public void recursion(List<Integer> list, TreeNode root){
        if(root == null) return;

        recursion(list, root.left);
        recursion(list, root.right);
        list.add(root.val);
    }
}
