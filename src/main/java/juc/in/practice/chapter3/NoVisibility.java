package juc.in.practice.chapter3;

/**
 * Description ：不可见
 *
 * @author： manji
 * 2018/7/30 14:14
 */
public class NoVisibility {
    private static  boolean ready;
    private static  int number;
    private static class  ReaderThread extends Thread {
        @Override
        public void run(){
            while (!ready){
//                try { Thread.sleep(100L); }
//                catch (InterruptedException e) {}
                /**
                 *  线程让步 >> 当前线程 : 运行状态 >> 就绪状态{让出线程,自己和大家一起抢线程执行权}
                 */
                Thread.yield();
            }
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = Boolean.TRUE;
    }
}
