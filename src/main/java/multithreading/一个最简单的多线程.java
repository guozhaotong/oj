package multithreading;

/** 一个最简单的多线程
 * @author 郭朝彤
 * @date 2018/3/7.
 */
public class 一个最简单的多线程 extends Thread{
    private static int i = 0;
    static Object object = new Object();

    @Override
    public void run(){
        for(int j = 0; j < 1000; j++) {
            synchronized(object) {i++;}
//            try {
//                sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        for(int k = 0; k < 10; k++){
            Thread t1 = new 一个最简单的多线程();
            Thread t2 = new 一个最简单的多线程();
            t1.start();
            t2.start();
        }
//        try {
//            sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println(i);
    }
}
