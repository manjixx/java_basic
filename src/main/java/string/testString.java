package string;

/**
 * Created by manji on 2018/5/31.
 */
public class testString {

    public static void main(String[] args) {

        String str1 = "ab";
        String str2 = "c";
        String str3 = str1 + str2;

        String addStr ="ab" + "c";
        String str = "abc";
        String newStr = new String("abc");

        System.out.println(str3 == str);

        System.out.println(str == "abc");

        System.out.println(newStr == "abc" );

        System.out.println(str == newStr);

        System.out.println(str3 == newStr );
    }


}
