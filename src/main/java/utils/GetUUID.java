package utils;

import java.util.UUID;

/**
 * @author manji
 * @date 2019-01-16 11:19
 */
public class GetUUID {
    public static void main(String[] args) {
        String s = UUID.randomUUID().toString();
        String replace = s.replace("-", "");
        System.out.println(s);
        System.out.println(replace);

    }
}
