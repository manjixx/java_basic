package juc.in.practice.chapter6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Description ：
 *
 * @author： manji
 * 2018/8/6 13:30
 */
public class FourMethod4CreateThreadPool {

    /**
     * @return
     */
    public ExecutorService createFixedPool(){

        final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(50);
        return fixedThreadPool;
    }

    /**
     *
     * @return
     */
    public ExecutorService createCachedPool(){
        final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        return cachedThreadPool;
    }

    /**
     *
     * @return
     */
    public ExecutorService createSinglePook(){
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        return singleThreadExecutor;
    }

    /**
     *
     * @return
     */
    public ExecutorService createScheduledPool(){
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(50);
        return scheduledThreadPool;
    }





}
