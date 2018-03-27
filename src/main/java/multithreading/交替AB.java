package multithreading;

import java.time.LocalTime;

/**
 * 用生产者-消费者模型来交替打印A和B十次，用两个线程分别打印不同字母
 *
 * @author 郭朝彤
 * @date 2018/3/7.
 */
public class 交替AB extends Thread {
    static String string = "";
    static volatile  int i = 0;
    private int j ;

    public void setJ(int j) {
        this.j = j;
    }

    public void produce() {
        while (true) {
//            synchronized (string) {
                if (i == 0) {
                    System.out.print("A");
                    i = 1;
//                }
            }
        }
    }

    public void consume() {
        while (true) {
//            synchronized (string) {
                if (i == 1) {
                    System.out.print("B");
                    System.out.println(LocalTime.now());
                    i = 0;
//                }
            }
        }

    }

    @Override
    public void run() {
        if(j == 0) {
            produce();
        } else {
            consume();
        }
    }

    public static void main(String[] args) {
        交替AB t1 = new 交替AB();
        t1.setJ(0);
        交替AB t2 = new 交替AB();
        t2.setJ(1);
        t1.start();
        t2.start();
    }
}
