package medium;

/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */
public class M019_removeNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0){
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode fast = head;
        ListNode slow = newHead;
        for(int i = 0; i < n-1; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return newHead.next;
    }
}
