package medium;


/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8 (342+465=807)
 *
 * @author 郭朝彤
 * @date 2017/11/18.
 */
public class M002_addTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            curr.next = new ListNode((carry + x + y) % 10);
            carry = (carry + x + y) / 10;
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return head.next;
    }

    public static ListNode cloneListNode(ListNode listNode) {
        ListNode newListNode = new ListNode(listNode.val);
        newListNode.next = listNode.next;
        return newListNode;
    }

    public static void main(String[] args) {
        ListNode oneNode = new ListNode(3);
        oneNode.next = cloneListNode(oneNode);
        oneNode.val = 4;
        oneNode.next = cloneListNode(oneNode);
        oneNode.val = 2;
        ListNode twoNode = new ListNode(4);
        twoNode.next = cloneListNode(twoNode);
        twoNode.val = 6;
        twoNode.next = cloneListNode(twoNode);
        twoNode.val = 5;
//        System.out.println(oneNode.toString());
//        System.out.println(twoNode.toString());
        System.out.println(addTwoNumbers(oneNode, twoNode).toString() );
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public String toString() {
        if(this.size() == 0){
            return "null!";
        }
        StringBuffer stringBuffer = new StringBuffer("");
        ListNode curNode = M002_addTwoNumbers.cloneListNode(this);
        while(true) {
            stringBuffer.append(curNode.val + " ");
            if(curNode.next == null){
                break;
            }
            curNode = M002_addTwoNumbers.cloneListNode(curNode.next);
        }
        return stringBuffer.toString();
    }

    public int size() {
        int size = 0;
        if (this == null) {
            return size;
        }
        size++;
        ListNode newNode = this;
        while (newNode.next != null) {
            size++;
            newNode = M002_addTwoNumbers.cloneListNode(newNode.next);
        }
        return size;
    }
}
