import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {

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

   public List<Integer> preorderTraversal(TreeNode root) {
        // Stack<TreeNode> stack = new Stack<>();
        List<Integer> answer = new ArrayList<>();

        // if(root == null) return answer;
        // stack.push(root);
        
        // while(!stack.isEmpty()){
        //     TreeNode current = stack.pop();
        //     answer.add(current.val);
        //     if(current.right != null) stack.push(current.right);
        //     if(current.left != null) stack.push(current.left);

        // }

        recursion(answer, root);

        return answer;
    }

    public void recursion(List<Integer> list, TreeNode root){
        if(root == null) return;

        list.add(root.val);
        recursion(list, root.left);
        recursion(list, root.right);
    }
}
