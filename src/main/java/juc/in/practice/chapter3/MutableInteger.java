package juc.in.practice.chapter3;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Description ：UnThreadSafe
 *
 * @author： manji
 * 2018/7/30 15:51
 */
public class MutableInteger {
    private int value;

    public int get(){
        return value;
    }
    public void set(int value){
        this.value = value;
    }
}
