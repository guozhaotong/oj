package hard;
import hard.ListNode;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author 郭朝彤
 * @date 2017/12/6.
 */
public class H023_mergeKSortedLists {
    public ListNode mergeKLists1(ListNode[] lists) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(ListNode list: lists){
            if(list == null){
                continue;
            }
            while (list != null){
                linkedList.add(list.val);
                list = list.next;
            }
        }
        if(linkedList.size() == 0){
            return null;
        }
        Collections.sort(linkedList);
        ListNode node = new ListNode(linkedList.get(0));
        ListNode head = node;
        for(int i = 1; i < linkedList.size(); i++){
            node.next = new ListNode(linkedList.get(i));
            node = node.next;
        }
        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int end = lists.length;
        if(end == 0){
            return null;
        }
        ListNode node = new ListNode(0);
        ListNode head = node;
        end = putNullToEnd(lists, end);
        while (lists[0] != null){
            node.next = lists[minIndex(lists, end)];
            node = node.next;
            lists[minIndex(lists, end)] = lists[minIndex(lists, end)].next;
            end = putNullToEnd(lists, end);
        }
        return head.next;
    }
    public int putNullToEnd(ListNode[] lists, int end){
        while (end > 0 && lists[end-1] == null){
            end--;
        }
        for(int i = 0; i < end; i++){
            if(lists[i] == null){
                swap(lists, i, --end);
            }
        }
        return end;
    }
    public void swap(ListNode[] lists, int i, int j){
        ListNode t = lists[i];
        lists[i] = lists[j];
        lists[j] = t;
    }
    public int minIndex(ListNode[] lists, int end){
        int min = lists[0].val;
        int index = 0;
        for(int i = 1; i < end; i++){
            if(lists[i].val < min){
                min = lists[i].val;
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args){

    }
}
