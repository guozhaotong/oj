package multithreading;

/**
 * 用生产者-消费者模型来交替打印A和B十次，用两个线程分别打印不同字母
 *
 * @author 郭朝彤
 * @date 2018/3/7.
 */
public class M3 extends Thread {
    static String string = "";
    static int i = 0;

    public void produce() {
        while (true) {
            synchronized (string) {
                System.out.print("A");
                i = 1;
            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (string) {
                System.out.print("B");
                i = 0;
            }
        }

    }

    @Override
    public void run(){
        if(i == 0){
            produce();
        }
        else {
            consume();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new M3();
        Thread t2 = new M3();
        t1.start();
        t2.start();
    }
}
