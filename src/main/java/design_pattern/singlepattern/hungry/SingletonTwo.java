package design_pattern.singlepattern.hungry;

/**
 * Description ：饿汉式 静态代码块初始化类
 *
 * @author： manji
 * 2018/6/3 18:59
 */
public class SingletonTwo {

        private static SingletonTwo singletonTwo;
        static {
            singletonTwo = new SingletonTwo();
        }
        private SingletonTwo(){}

        public static SingletonTwo getInstance(){
            return  singletonTwo;
        }
}
