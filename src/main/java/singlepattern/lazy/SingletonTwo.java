package singlepattern.lazy;

/**
 * Description ：懒汉式 ( 线程安全 )
 * 通过加syn锁的方式 去控制线程安全
 * @author： manji
 * 2018/6/3 17:00
 */
public class SingletonTwo {
    private static  SingletonTwo singletonTwo;

    private SingletonTwo() {}

    public static synchronized  SingletonTwo getInstance(){
        if (singletonTwo == null){
            singletonTwo = new SingletonTwo();
        }
        return singletonTwo;
    }
}
