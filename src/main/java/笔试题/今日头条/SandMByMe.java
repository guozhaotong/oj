package 笔试题.今日头条;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 郭朝彤
 * @date 2018/3/26.
 */
public class SandMByMe {
    public static void main(String[] args) {
        System.out.println(minTimes(1));
    }

    public static int minTimes(int n) {
        int m = 0, s = 1, t = 0;
        Queue<Triple> queue = new LinkedList<>();
        queue.add(new Triple(m, s, t));
        Triple triple;
        while ((triple = queue.poll()).s != n) {
            m = triple.s;
            s = triple.s * 2;
            t = triple.t + 1;
            if (s == n) {
                return t;
            }
            queue.offer(new Triple(m, s, t));
            m = triple.m;
            s = triple.s + triple.m;
            t = triple.t + 1;
            if (s == n) {
                return t;
            }
            queue.offer(new Triple(m, s, t));
        }
        return t;
    }
}

class Triple {
    int m;
    int s;
    int t;

    public Triple() {
    }

    public Triple(int m, int s, int t) {
        this.m = m;
        this.s = s;
        this.t = t;
    }
}

