package utils;

import com.google.gson.*;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Json 工具类
 *
 * @author manji
 * @date 2019-03-18 17:25
 */
public class JsonUtil {

    /**
     * @param var1       需要比较的json串1
     * @param var2       需要比较的json串2
     * @param ignoreKeys 需要忽略的属性
     * @return
     */
    public static Boolean compareJson(String var1, String var2, String[] ignoreKeys) throws Exception {

        JsonParser parser = new JsonParser();

        try {
            JsonElement jsonElement1 = parser.parse(var1);
            JsonElement jsonElement2 = parser.parse(var2);

            Stream.of(ignoreKeys).forEach(
                    ignoreKey -> {
                        removeByKye(jsonElement1, "1", ignoreKey);
                        removeByKye(jsonElement2, "1", ignoreKey);
                    }
            );

            JsonObject asJsonObject1 = jsonElement1.getAsJsonObject();
            JsonObject asJsonObject2 = jsonElement2.getAsJsonObject();
            return asJsonObject1.equals(asJsonObject2);

        } catch (Exception e) {
            throw new Exception("比对Json错误,详细请检查");
        }
    }

    /**
     * 移除
     * @param element
     * @param keyName
     * @param key
     */
    private static void removeByKye(JsonElement element, String keyName, final String key) {
        if (element == null || element.isJsonNull()) {
            return;
        } else if (element.isJsonArray()) {

            JsonArray jsonArray = element.getAsJsonArray();
            // 循环数组 干掉
            jsonArray.forEach(j -> removeByKye(j, keyName, key));

        } else if (element.isJsonObject()) {
            JsonObject jsonObject = element.getAsJsonObject();

            Set<String> strings = jsonObject.keySet();

            if (strings.contains(key)) {
                jsonObject.remove(key);
//                System.err.println(keyName);
            }

            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {

                String name = entry.getKey();
                JsonElement jsonElement = entry.getValue();

                removeByKye(jsonElement, name, key);
            }
        }
    }


}
