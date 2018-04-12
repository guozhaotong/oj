package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/12.
 */
public class 两个链表的第一个公共结点 {
    public static void main(String[] args) {

    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = 0, len2 = 0;
        ListNode temp = pHead1;
        while (temp != null) {
            temp = temp.next;
            len1++;
        }
        temp = pHead2;
        while (temp != null) {
            temp = temp.next;
            len2++;
        }
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        if (len1 > len2) {
            int dif = len1 - len2;
            for (int i = 0; i < dif; i++) {
                l1 = l1.next;
            }
        } else {
            int dif = len2 - len1;
            for (int i = 0; i < dif; i++) {
                l2 = l2.next;
            }
        }
        while (l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }
}
