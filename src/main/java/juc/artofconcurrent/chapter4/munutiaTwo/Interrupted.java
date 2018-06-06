package juc.artofconcurrent.chapter4.munutiaTwo;

import com.sun.org.apache.xpath.internal.operations.Bool;
import juc.artofconcurrent.chapter4.utils.SleepUtils;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.TimeUnit;

/**
 * 线程中断  理解
 * Created by manji on 2018/5/28.
 */
public class Interrupted {

    public static void main(String[] args) throws Exception {
        /**
         * Sleep 不停睡
         */
        Thread sleepThread = new Thread(new SleepRunner(), "SleepThread");
        sleepThread.setDaemon(Boolean.TRUE);
        /**
         *  busyThread 不停运行
         */
        Thread busyThread = new Thread(new BusyRunner() ,"BusyThread");
        busyThread.setDaemon(Boolean.TRUE);
        sleepThread.start();
        busyThread.start();
        TimeUnit.SECONDS.sleep(5L);
        sleepThread.join();
        /**
         * 中断
         */
        sleepThread.interrupt();
        busyThread.interrupt();
        System.out.println("SleepThread interrupt is : " + sleepThread.isInterrupted());
        System.out.println("BusyThread interrupt is : " + busyThread.isInterrupted());
        SleepUtils.second(2L);

    }

    static  class  SleepRunner implements  Runnable{

        @Override
        public void run() {
            while (Boolean.TRUE){
                SleepUtils.second(10L);
            }
        }
    }

    static class BusyRunner implements Runnable{

        @Override
        public void run() {
            while (Boolean.TRUE){}
        }
    }


}
