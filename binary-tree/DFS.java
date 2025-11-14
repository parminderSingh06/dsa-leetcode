import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    
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
    
    public void dfs(TreeNode head){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<TreeNode> visited = new ArrayList<>();
        TreeNode current = head;
        stack.push(current);
        while(!stack.isEmpty()){
            current = stack.pop();
            visited.add(current);
            if(current.right != null) stack.push(current.right);
            if(current.left != null) stack.push(current.left);
        }
    }

    public void dfsRecursive(TreeNode head){
        if(head == null) return;
        dfsRecursive(head.right);
        dfsRecursive(head.left);
    }
}
