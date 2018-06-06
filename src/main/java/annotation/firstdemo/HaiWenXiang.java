package annotation.firstdemo;

import java.lang.annotation.*;

/**
 * Description ：
 *
 * @author： manji
 * 2018/4/4 11:22
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface HaiWenXiang {

    String name() default "haiweixiang";
    String url() default "linyaozhansi";

}
