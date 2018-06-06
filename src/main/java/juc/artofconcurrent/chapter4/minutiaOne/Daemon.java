package juc.artofconcurrent.chapter4.minutiaOne;

import juc.artofconcurrent.chapter4.utils.SleepUtils;

/**
 * 守护线程
 * Created by manji on 2018/5/28.
 */
public class Daemon {

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(), "DaemonRunner");
        System.out.println("DaemonThread run before start.");
        thread.setDaemon(Boolean.TRUE);
        thread.start();
    }

    static  class  DaemonRunner implements Runnable{

        @Override
        public void run() {
            try {
                System.out.println("DaemonThread run before start.");
                SleepUtils.second(10L);
            }finally {
                System.out.println("DaemonThread finally run.");
            }
        }
    }




}
