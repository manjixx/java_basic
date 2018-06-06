package juc.artofconcurrent.chapter4.utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by manji on 2018/5/26.
 */
public class SleepUtils {
    public static final void second(long seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
