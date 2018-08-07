package regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description ：
 *
 * @author： manji
 * 2018/6/25 14:07
 */
public class DemoTwo {

    public static void main(String[] args) {

        String string ="http://www.runoob.com:80/html/html-tutorial.html";
        String pattern = "/(\\w+):\\/\\/([^/:]+)(:\\d*)?([^# ]*)/";

        Pattern r = Pattern.compile(pattern);

        final Matcher m = r.matcher(string);

        System.out.println(m.toString());
        if (m.find()){
            System.out.println("Found value: " + m.group(0) );
        } else {
            System.out.println("NO MATCH");
        }


    }


}
