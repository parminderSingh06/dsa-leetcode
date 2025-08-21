import java.util.Stack;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode current = head;
        int listSize = 0;
        Stack<ListNode> stack = new Stack<>();

        while(current != null){
            stack.push(current);
            current = current.next;
            listSize++;
        }

        current = head;
        ListNode finalNode = current;
        for(int i=0;i<listSize/2;i++){
            ListNode stackNode = stack.pop();
            ListNode tempNext = current.next;

            current.next = stackNode;
            stackNode.next = tempNext;
            current = current.next.next;
            finalNode = stackNode.next;
        }
        finalNode.next = null;
    }
}
