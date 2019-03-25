package design_pattern.singlepattern.recommend;

/**
 * Description ：单例模式下的双重检查
 * 当中其实使用了懒汉式中的同步代码块
 * @author： manji
 * 2018/6/3 18:36
 */
public class SingletonDoubleCheck {

    private static SingletonDoubleCheck singleton;

    private SingletonDoubleCheck(){}

    public static SingletonDoubleCheck getInstance(){

        if (singleton == null){
            synchronized (SingletonDoubleCheck.class){
                if (singleton == null){
                    singleton = new SingletonDoubleCheck();
                }
            }
        }
        return singleton;
    }
}
