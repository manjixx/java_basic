package juc.artofconcurrent.chapter7.minutiaTeo;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * 原子更新数据
 * Created by manji on 2018/5/29.
 */
public class AtomicIntegerArrayTest {

    static int[] value = new int[]{1,2};

    static AtomicIntegerArray array = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        array.getAndSet(0,3);
        System.out.println( array.toString() + "--" + array.get(0));
        System.out.println(value[0] + "--" + value[1] );
    }


}
