package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/2.
 */
public class 链表中倒数第k个结点 {
    public static void main(String[] args) {

    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur != null) {
                cur = cur.next;
            } else {
                return null;
            }
        }
        ListNode slow = head;
        while (cur != null) {
            cur = cur.next;
            slow = slow.next;
        }
        return slow;
    }
}
