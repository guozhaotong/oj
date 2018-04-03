package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/2.
 */
public class 反转链表 {
    public static void main(String[] args) {

    }

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode();
        ListNode nxt = head.next;
        head.next = null;
        newHead.next = head;
        while (nxt != null) {
            head = nxt;
            nxt = nxt.next;
            head.next = newHead.next;
            newHead.next = head;
        }
        return newHead.next;
    }
}
