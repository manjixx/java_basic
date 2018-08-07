package juc.in.practice.chapter3;

/**
 * Description ：SafeThread
 *
 * @author： manji
 * 2018/7/30 15:53
 */
public class SynchronizedInteger {

    private int value;

    public synchronized  int get(){
        return value;
    }

    public synchronized void  set(int value){
        this.value = value;
    }

}
