package juc.artofconcurrent.chapter4.minutia_one;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 线程优先级
 * 代码说明 程序的正确运行和 线程的优先级没什么关系
 * Created by manji on 2018/5/26.
 */
//TODO  注释
public class Priority {

    private static  volatile  boolean  notStart = Boolean.TRUE;
    private static  volatile  boolean  notEnd = Boolean.TRUE;

    public static void main(String[] args) throws InterruptedException {

        List<Job> jobs = new ArrayList<>();
        /**
         * 同时启 10条线程 run 起来
         *
         */
        for (int i = 0; i < 10 ; i++){
            int priority = i < 5 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY;
            Job job = new Job(priority);
            jobs.add(job);
            Thread thread = new Thread(job ,"thread :" + i);
            thread.setPriority(priority);
            thread.start();
        }
        /**
         *
         */
        notStart = Boolean.FALSE;
        TimeUnit.SECONDS.sleep(10);
        notEnd = Boolean.FALSE;
        jobs.forEach(job -> {
            System.out.println("Job Priority : " + job.priority + " , count : " + job.jobCount);
        });

    }


    private static class Job implements Runnable {
        private int priority;
        private long jobCount;

        public Job(int priority) {
            this.priority = priority;
        }
       public void run(){
            while (notStart){
                Thread.yield();
            }
            while (notEnd){
                //https://www.cnblogs.com/java-spring/p/8309931.html  关于yield 的解释形象生动
                Thread.yield();
                jobCount++;
            }
       }

    }
}
