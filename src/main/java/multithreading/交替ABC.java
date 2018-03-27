package multithreading;



/** 用三个线程交替打印“ABC”10次，每个线程负责打印一个字母
 * @author 郭朝彤
 * @date 2018/3/7.
 */
public class 交替ABC extends Thread {
    String s;
    static int i = 0;

    static Object object = new Object();

    @Override
    public void run() {
        while( i < 30 ) {

            if(i % 3 == 0 && "A".equals(s)){
                System.out.print("A");
                add();
            } else if (i % 3 == 1 && "B".equals(s)){
                System.out.print("B");
                add();
            } else if (i % 3 == 2 && "C".equals(s)){
                System.out.print("C");
                add();
            }
        }
    }

    public 交替ABC(String s) {
        this.s = s;
    }

    public synchronized void add(){
        i++;
    }

    public static void main(String[] args) {
        Thread t1 = new 交替ABC("A");
        Thread t2 = new 交替ABC("B");
        Thread t3 = new 交替ABC("C");
        t1.start();
        t2.start();
        t3.start();

    }
}
