package annotation.firstdemo;

/**
 * Description ：
 *
 * @author： manji
 * 2018/4/4 11:28
 */
@ManjiAnnotation("不要默认值==manji")
public class Annotation {

    @KuiBa("第三代")
    private String str = "";

    @HaiWenXiang()
    public String getDefaultValue() {
        return "get defaultValue 4 Annotation";
    }
    @HaiWenXiang(name="xiangxiang",url="baidu.com")
    public String getSetValue() {
        return "get setValue 4 Annotation";
    }


}
