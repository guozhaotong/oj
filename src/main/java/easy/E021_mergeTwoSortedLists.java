package easy;

/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class E021_mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newH = new ListNode(0);
        ListNode p1 = l1, p2 = l2, head = newH;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                newH.next = p1;
                p1 = p1.next;
            }
            else{
                newH.next = p2;
                p2 = p2.next;
            }
            newH = newH.next;
        }
        if(p1 == null){
            newH.next = p2;
        }
        else if(p2 == null){
            newH.next = p1;
        }
        return head.next;
    }
}
