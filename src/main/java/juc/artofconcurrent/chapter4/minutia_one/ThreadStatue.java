package juc.artofconcurrent.chapter4.minutia_one;

import juc.artofconcurrent.chapter4.utils.SleepUtils;

import java.util.concurrent.Callable;

/**
 * 线程状态
 * Created by manji on 2018/5/26.
 */
public class ThreadStatue {

    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "TimeWaitingThread").start();
        new Thread(new Waiting(),"WaitThread").start();

        new Thread(new Blocked(),"BlockedThread-1").start();
        new Thread(new Blocked(),"BlockedThread-2").start();

    }

    /**
     * 线程不停睡
     */
    static class TimeWaiting implements Runnable{
        @Override
        public void run() {
           while (Boolean.TRUE){
               SleepUtils.second(100L);
           }
        }
    }

    /**
     * 该线程在Waiting.class 实例上等待
     */
    static class Waiting  implements Runnable {
        @Override
        public void run() {
            synchronized (Waiting.class){
                try {
                    Waiting.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 该线程在Blocked.class 加锁后不会释放该锁
     */
    static class Blocked implements Runnable {
        @Override
        public void run() {
            synchronized (Blocked.class) {
                while (Boolean.TRUE) {
                    SleepUtils.second(100L);
                }
            }
        }
    }

    /**
     * 回调线程
     */
    static class CallBack implements Callable<String>{
        @Override
        public String call() throws Exception {
            return "this is callable.";
        }
    }

}
