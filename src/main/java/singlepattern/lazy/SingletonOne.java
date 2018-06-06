package singlepattern.lazy;

/**
 * Description ：懒汉式 ( 线程不安全 )
 * 单线程下使用，如果是多线程下使用，在if条件判断的时候可能产生多个实例对象
 * @author： manji
 * 2018/6/3 11:21
 */
public class SingletonOne {

    private static  SingletonOne singleton;
    /**
     * 私有空构造函数
     */
    private SingletonOne() {}

    public static  SingletonOne getSingleton(){
        if(singleton == null){
            singleton = new SingletonOne();
        }
        return singleton;
    }
}
