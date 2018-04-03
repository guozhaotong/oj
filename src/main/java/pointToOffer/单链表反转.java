package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/3/19.
 */
public class 单链表反转 {
    public static void main(String[] args) {

    }

    public ListNode reverse(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode p = null, c = listNode, n = listNode.next;
        while (n != null) {
            c.next = p;
            p = c;
            c = n;
            n = c.next;
        }
        c.next = p;
        return c;
    }
}

class ListNode {
    public int value;
    public ListNode next;


    public void ListNode(int value) {
        this.value = value;
    }
}
