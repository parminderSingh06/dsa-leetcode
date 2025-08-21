public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            if(fast == slow) return true;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;        
    }    
}
