package annotation.firstdemo;

import java.lang.annotation.*;

/**
 * Description ：
 *
 * @author： manji
 * 2018/4/4 11:26
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface KuiBa {

    String value() default "kuiba";
}
