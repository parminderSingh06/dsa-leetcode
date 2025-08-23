import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        Stack<TreeNode> stackOne = new Stack<>();
        Stack<TreeNode> stackTwo = new Stack<>();
        stackOne.add(root);

        while(!stackOne.isEmpty()){
            TreeNode current = stackOne.pop();
            stackTwo.push(current);
            if(current.left != null) stackOne.push(current.left);
            if(current.right != null) stackOne.push(current.right);
        }

        while(!stackTwo.isEmpty()){
            answer.add(stackTwo.pop().val);
        }



        //recursion(answer, root);
        return answer;
    }

    public void recursion(List<Integer> list, TreeNode root){
        if(root == null) return;

        recursion(list, root.left);
        recursion(list, root.right);
        list.add(root.val);
    }
}
