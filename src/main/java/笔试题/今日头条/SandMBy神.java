package 笔试题.今日头条;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author 郭朝彤
 * @date 2018/3/26.
 */
public class SandMBy神 {
    static HashMap<Integer, Integer> qmap = new HashMap<Integer, Integer>();
    static Queue<Integer> queue = new LinkedList<Integer>();
    static int n = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println(0);
            return;
        }
        qmap.put(1 * (n + 1) + 1, 0);
        queue.offer(1 * (n + 1) + 1);
        while (!queue.isEmpty()) {
            int head = queue.poll();
            int step = qmap.get(head);
            int x = head / (n + 1);
            int y = head % (n + 1);

            if (2 * y == n) {
                System.out.println(step + 1);
                return;
            } else if (x + y == n) {
                System.out.println(step + 1);
                return;
            }

            if (2 * y < n) {
                int t = y * (n + 1) + 2 * y;
                if (!qmap.containsKey(t)) {
                    qmap.put(t, step + 1);
                    queue.offer(t);
                }
            }
            if (x + y < n) {
                int t = x * (n + 1) + x + y;
                if (!qmap.containsKey(t)) {
                    qmap.put(t, step + 1);
                    queue.offer(t);
                }
            }
        }
    }
}
