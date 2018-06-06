package singlepattern.hungry;

/**
 * Description ：饿汉式 ( )
 * 在类创建的时候就创建 静态变量 然后可以直接通过静态方式 去掉用获得单例对象
 * @author： manji
 * 2018/6/3 18:12
 */
public class SingletonOne {

    private SingletonOne(){}

    private static final SingletonOne singletonOne =  new SingletonOne();

    public static SingletonOne getInstance(){
        return singletonOne;
    }
}
