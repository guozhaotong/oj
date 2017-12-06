package hard;

/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */
public class H025_reverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode moveStart = start;
        ListNode fast = start;
        while (head != null) {
            for (int i = 0; i < k; i++) {
                if (fast.next != null) {
                    fast = fast.next;
                } else {
                    return start.next;
                }
            }
            reverseRange(moveStart, k);
            fast = head;
            head = head.next;
            moveStart = fast;
        }
        return start.next;
    }
    public void reverseRange(ListNode start, int k){
        ListNode head = start.next;
        for(int i = 1; i < k; i++) {
            ListNode temp = start.next;
            start.next = head.next;
            head.next = start.next.next;
            start.next.next = temp;
        }
    }
}
