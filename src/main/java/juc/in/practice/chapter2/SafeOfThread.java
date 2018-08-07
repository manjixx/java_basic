package juc.in.practice.chapter2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Description ：延迟初始化中的竞态条件
 *
 * @author： manji
 * 2018/7/26 14:40
 */
public class SafeOfThread {

    /**
     * 原子变量
     */
    private final AtomicLong count = new AtomicLong(0);

    public void service(){
    // service 执行一次,调用incrementAndGet 返回的是递增后的值 确保++count执行的原子性
        final long countAfter = count.incrementAndGet();
    }
}
