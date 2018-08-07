package juc.in.practice.chapter5;

import java.util.Vector;

/**
 * Description ：
 *
 * @author： manji
 * 2018/8/1 13:58
 */
public class Vector4SafeThread {

    public static Object getLast(Vector vector){
        synchronized (vector){
            int lastIndex = vector.size() - 1;
            return vector.get(lastIndex);
        }
    }

    public static void delete(Vector vector){
        synchronized (vector){
            int lastIndex = vector.size() -1;
            vector.remove(lastIndex);
        }
    }
}
