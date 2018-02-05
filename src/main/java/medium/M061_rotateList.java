package medium;

/**
 * @author 郭朝彤
 * @date 2017/12/26.
 */
public class M061_rotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode curNode = newHead.next;
        for(int i = 0; i < k; i++){
            curNode = curNode.next;
        }
        ListNode endNode = curNode;
        while(endNode.next != null){
            endNode = endNode.next;
        }
        newHead.next = curNode.next;
        curNode.next = endNode.next;
        endNode.next = head;
        return newHead.next;
    }
}
