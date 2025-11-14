import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

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
    
    public void bfs(TreeNode head){ 
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<TreeNode> visited = new ArrayList<>();

        TreeNode current = head;
        queue.add(current);

        while(!queue.isEmpty()){
            current = queue.poll();
            visited.add(current);
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        
    }   
}