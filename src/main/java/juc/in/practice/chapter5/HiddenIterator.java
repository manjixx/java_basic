package juc.in.practice.chapter5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Description ：隐藏在字符串连接中的迭代操作
 * @author： manji
 * 2018/8/1 14:44
 */
public class HiddenIterator {
    private final Set<Integer> set = new HashSet<>(32);
    public synchronized void add(Integer i){
        set.add(i);
    }
    public synchronized void remove(Integer i){
        set.remove(i);
    }
    public void addTenThings(){
        Random r = new Random();
        for (int i = 0; i< 10 ; i++){
            add(r.nextInt());
            System.out.println("DEBUG : added ten element to " + set);
        }
    }
}
