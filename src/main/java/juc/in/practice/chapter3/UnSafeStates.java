package juc.in.practice.chapter3;

/**
 * Description ：使得内部可变状态溢出
 *
 * @author： manji
 * 2018/7/30 18:25
 */
public class UnSafeStates {
    /**
     * 出现的问题：任何调用者可以修改数组中的内容，数组已经溢出了其所在作用域
     */
    private String[] states = new String[]{
            "AK","AL"
    };
    public String[] getStates() {
        return states;
    }
}
