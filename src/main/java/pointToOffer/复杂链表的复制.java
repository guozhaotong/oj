package pointToOffer;

/**
 * @author 郭朝彤
 * @date 2018/4/4.
 */
public class 复杂链表的复制 {
    public static void main(String[] args) {
        RandomListNode r1 = new RandomListNode(1);
        RandomListNode r2 = new RandomListNode(2);
        RandomListNode r3 = new RandomListNode(3);
        RandomListNode r4 = new RandomListNode(4);
        RandomListNode r5 = new RandomListNode(5);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r4.next = r5;
        r1.random = r3;
        r2.random = r5;
        r4.random = r2;
        RandomListNode p = Clone(r1);
        System.out.println(p.next.random.label);
    }

    public static RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode p1 = twoTimeNodes(pHead);
        RandomListNode p2 = twoTimePionters(p1);
        RandomListNode p3 = getRandomList(p2);
        return p3;
    }

    public static RandomListNode twoTimeNodes(RandomListNode pHead) {
        RandomListNode cur = pHead;
        RandomListNode nxt;
        while (cur != null) {
            nxt = cur.next;
            RandomListNode temp = new RandomListNode(cur.label);
            cur.next = temp;
            temp.next = nxt;
            cur = nxt;
        }
        return pHead;
    }

    public static RandomListNode twoTimePionters(RandomListNode pHead) {
        RandomListNode cur = pHead;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        return pHead;
    }

    public static RandomListNode getRandomList(RandomListNode pHead) {
        RandomListNode newHead = pHead.next;
        RandomListNode cur = newHead;
        while (cur.next != null) {
            cur.next = cur.next.next;
            cur = cur.next;
        }
        return newHead;
    }
}


class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}