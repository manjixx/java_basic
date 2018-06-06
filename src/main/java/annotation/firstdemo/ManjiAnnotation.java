package annotation.firstdemo;

import java.lang.annotation.*;

/**
 * Description ：注解
 *
 * @author： manji
 * 2018/4/4 11:12
 */
@Documented
/**
 * Retention注解
 * Retention(保留)注解说明,这种类型的注解会被保留到那个阶段. 有三个值:
 * 1.RetentionPolicy.SOURCE
 *      这种类型的Annotations只在源代码级别保留,编译时就会被忽略
 * 2.RetentionPolicy.CLASS
 *      这种类型的Annotations编译时被保留,在class文件中存在,但JVM将会忽略
 * 3.RetentionPolicy.RUNTIME
 *      这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用.
 */
@Retention(RetentionPolicy.RUNTIME)
/**
 *  详情见 JDK 源码
 */
@Target(ElementType.TYPE)
public @interface ManjiAnnotation {

    String value()  default "manjixx";

}
