import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

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


    public List<Integer> inorderTraversal(TreeNode root) {
        
       List<Integer> answer = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return answer;

        TreeNode current = root;
        while(!stack.isEmpty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.left; 
            }           
            else{
                current = stack.pop();
                answer.add(current.val);
                current = current.right;
            }
        }
        return answer;            
    }
}
