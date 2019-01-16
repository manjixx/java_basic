package design_pattern.singlepattern.lazy;

/**
 * Description ：懒汉式加载 ( 同步代码块加载模式 )
 *
 * @author： manji
 * 2018/6/3 18:39
 */
public class SingletonThree {

    private static SingletonThree singletonThree;

    private SingletonThree(){}

    public static  SingletonThree getInstance(){

        if ( singletonThree == null){
            synchronized(SingletonThree.class){
                singletonThree = new SingletonThree();
            }
        }
        return singletonThree;
    }
}
