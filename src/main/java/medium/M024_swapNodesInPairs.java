package medium;

/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */
public class M024_swapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode pre = node;
        while (head != null && head.next != null){
            pre.next = head.next;
            head.next = head.next.next;
            pre.next.next = head;
            pre = head;
            head = head.next;
        }
        return node.next;
    }
}
