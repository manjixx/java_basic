package utils.test;

import org.junit.Test;
import utils.JsonUtil;

/**
 *  Test - JsonUtil
 * @author manji
 * @date 2019-03-18 17:42
 */
public class TestJsonUtil {

    @Test
    public void testCompareJson() throws Exception {

        final String str1 = "{\"name\":\"BeJson\",\"url\":\"http://www.bejson.com\",\"page\":88,\"isNonProfit\":true,\"address\":{\"name\":\"BeJson\",\"street\":\"科技园路.\",\"city\":\"江苏苏州\",\"country\":\"中国\"},\"links\":[{\"name\":\"Google\",\"enhen\":[{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"}],\"url\":\"http://www.google.com\"},{\"name\":\"Baidu\",\"enhen\":[{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"}],\"url\":\"http://www.baidu.com\"},{\"name\":\"SoSo\",\"enhen\":[{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"}],\"url\":\"http://www.SoSo.com\"}]}";

        final String str2 = "{\"name\":\"BeJson\",\"url\":\"http://www.bejson.com\",\"page\":88,\"isNonProfit\":true,\"address\":{\"name\":\"BeJson\",\"street\":\"科技园路.\",\"city\":\"江苏苏州\",\"country\":\"中国\"},\"links\":[{\"name\":\"Google\",\"enhen\":[{\"name\":\"man212ji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"manj212i\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"maeqnji\",\"key\":11,\"shenma\":\"haode\"}],\"url\":\"http://www.google.com\"},{\"name\":\"Baiedu\",\"enhen\":[{\"name\":\"macdanji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"mancddji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"mancdji\",\"key\":11,\"shenma\":\"haode\"}],\"url\":\"http://www.baidu.com\"},{\"name\":\"SoSo\",\"enhen\":[{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"manddadji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"}],\"url\":\"http://www.SoSo.com\"}]}";

        String str3 = "{\"name\":\"BeJson\",\"url\":\"http://www.bejson.com\",\"page\":88,\"shenma\":\"haddodade\",\"isNonProfit\":true,\"address\":{\"name\":\"BeJson\",\"street\":\"科技园路.\",\"shenma\":\"hafdsfode\",\"city\":\"江苏苏州\",\"country\":\"中国\"},\"links\":[{\"name\":\"Google\",\"enhen\":[{\"name\":\"man212ji\",\"key\":11,\"shenma\":\"hafdsfode\"},{\"name\":\"manj212i\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"maeqnji\",\"key\":11,\"shenma\":\"haofafdde\"}],\"url\":\"http://www.google.com\"},{\"name\":\"Baiedu\",\"enhen\":[{\"name\":\"macdanji\",\"key\":11,\"shenma\":\"hafdsfode\"},{\"name\":\"mancddji\",\"key\":11,\"shenma\":\"haode\"},{\"name\":\"mancdji\",\"key\":11,\"shenma\":\"haode\"}],\"url\":\"http://www.baidu.com\"},{\"name\":\"SoSo\",\"enhen\":[{\"name\":\"manji\",\"key\":11,\"shenma\":\"haddode\"},{\"name\":\"manddadji\",\"key\":11,\"shenma\":\"haddodade\"},{\"name\":\"manji\",\"key\":11,\"shenma\":\"haode\"}],\"url\":\"http://www.SoSo.com\"}]}";

        // 测试忽略一个属性
        String[] keys =  new String[]{"name"};
        Boolean result1 = JsonUtil.compareJson(str1, str2, keys);
        System.out.println(result1);

        // 测试忽略多个属性
        String[] keys2 =  new String[]{"name","shenma"};
        Boolean result2 = JsonUtil.compareJson(str1, str3, keys2);
        System.out.println(result2);
    }


}
