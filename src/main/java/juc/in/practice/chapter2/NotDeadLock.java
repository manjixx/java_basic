package juc.in.practice.chapter2;

/**
 * Description ：
 * @author： manji
 * 2018/7/27 18:18
 */
public class NotDeadLock {

    /**
     * 如果内置锁是不可重入的，将发生死锁
     */
    public class Father{
        public  synchronized  void doSomething(){
        }
    }
    public class Child extends  Father{
        @Override
        public  synchronized  void  doSomething(){
            System.out.print(toString() + ": calling doSomething");
            super.doSomething();
        }
    }
}
