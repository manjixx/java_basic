package annotation.firstdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Description ：注解测试类
 *
 * @author： manji
 * 2018/4/4 11:33
 */
public class AnnotationTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Class annotation = Class.forName("annotation.firstdemo.Annotation");
        Method[] method = annotation.getMethods();
        boolean flag = annotation.isAnnotationPresent(ManjiAnnotation.class);
        if (flag) {
            ManjiAnnotation manjiAnnotation = (ManjiAnnotation) annotation.getAnnotation(ManjiAnnotation.class);
            System.out.println("First Annotation:" + manjiAnnotation.value() + "\n");
        }
        System.out.println("===================================");

        List<Method> list = new ArrayList<>();
        for (int i = 0; i < method.length; i++) {
            list.add(method[i]);
        }

        for (Method m : list) {
            HaiWenXiang haiWenXiang = m.getAnnotation(HaiWenXiang.class);
            if(haiWenXiang == null) {
                continue;
            }
            System.out.println("haiWenXiang annotation's\nname:\t" + haiWenXiang.name()
                    + "\nurl:\t" + haiWenXiang.url());
        }

        System.out.println("===================================");

//        List<Field> fieldList = new ArrayList<>();

        for(Field f : annotation.getDeclaredFields()){
            KuiBa kuiBa = f.getAnnotation(KuiBa.class);
            System.out.println("----kuiBa annotation: " + kuiBa.value());
        }
    }

}

