package main.java.java.base.abstract2interface;

/**
 * @author manji
 * @deacription
 * @date 2018/9/8 15:16
 */
public class Test {

    public static void main(String[] args) {
        Flying flying = new Fly4Abstract();
        Fly4Abstract fly4Abstract = new Fly4Abstract();
        fly4Abstract.fly();
        flying.fly();


    }

}
