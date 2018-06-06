package juc.artofconcurrent.chapter7.minutiaOne;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子操作 基础类型(Integer)
 * Created by manji on 2018/5/29.
 */
public class AtomicIntegerTest {

    static AtomicInteger integer = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(integer.getAndIncrement());
        System.out.println(integer.get());
    }


}
