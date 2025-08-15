import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        // ListNode current = head;
        // Stack<Integer> stack = new Stack<>();
        // while(current != null){
        //     stack.push(current.val);
        //     current = current.next;
        // }
        // ListNode newHead = new ListNode(stack.pop());
        // current = newHead;
        // while(!stack.empty()){
        //     ListNode newNode = new ListNode(stack.pop());
        //     current.next = newNode;
        //     current = current.next;
        // }
        
        // return newHead;

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }  
}