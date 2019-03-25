package utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Set;
import java.util.stream.Stream;

/**
 * @author manji
 * @date 2019-03-14 15:08
 */
public class CompareJson {

//    https://blog.csdn.net/bobozuyuan/article/details/57075300
    /**
     * 比较两个Json 字符串是否完全相同
     *
     * @param var1
     * @param var2
     * @return
     */
    public static boolean compareJsonComplete(String var1, String var2) {

        JsonParser parser = new JsonParser();
        JsonObject obj = (JsonObject) parser.parse(var1);
        JsonObject obj2 = (JsonObject) parser.parse(var2);
        boolean flag = obj.equals(obj2);
        return flag;
    }

    /**
     * 比较两个字符串是否相同 忽略空串
     *
     * @param var1
     * @param var2
     * @param keys 忽略不比较的字段
     * @return
     */
    public static boolean compareJsonIgnoreNull(String var1, String var2, String... keys) {

        JsonParser parser = new JsonParser();
        JsonObject obj = (JsonObject) parser.parse(var1);
        JsonObject obj2 = (JsonObject) parser.parse(var2);

        Stream.of(keys).forEach(key -> {
                    obj.remove(key);
                    obj2.remove(key);
                }
        );
        return obj.equals(obj2);
    }


    /**
     *
     * @return
     */
    private static boolean explain(String var1){

        JsonParser parser = new JsonParser();
        JsonObject obj = (JsonObject) parser.parse(var1);

        Set<String> keys = obj.keySet();

        boolean b = keys.stream().anyMatch(key -> key.equals(""));


        return true;
    }


}
