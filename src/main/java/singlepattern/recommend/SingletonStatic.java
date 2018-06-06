package singlepattern.recommend;

/**
 * Description ：静态代码块实现
 * EX: 类似于懒汉式加载，借助于JVM 的类初始化
 *        静态内部类在装载的时候并不会实例化，而是在实例化调用getInstance 方法的时候才会去实例化
 *        通过JVM 保证线程的安全性
 * @author： manji
 * 2018/6/3 18:44
 */
public class SingletonStatic {

    private SingletonStatic(){}

    /**
     * 私有静态代码块
     */
    private static class SingletonInstance{
        private static final SingletonStatic INSTANCE = new SingletonStatic();
    }

    public static SingletonStatic getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
