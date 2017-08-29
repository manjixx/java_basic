package Collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Collections.unmodifiableCollection这个可以得到一个集合的镜像，它的返回结果不可直接被改变，否则会提示
 * Created by manji on 2017/8/29.
 */
public class TestOne {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        Collection<String> cs = new ArrayList<>();
        cs.add("ss");
        al.add("ss");
        Collection<String> finalcs = Collections.unmodifiableCollection(cs);
        finalcs.add("error");
        Collection<String> finalal = Collections.unmodifiableCollection(al);
        finalal.add("error");
        System.out.println("Run To Here");

    }

}
