package utils.test;

import org.junit.Test;
import utils.CompareJson;

/**
 * @author manji
 * @date 2019-03-14 15:21
 */

public class TestCompareJson {

    @Test
    public void testCompareTwoJson(){

        final String str1 = "{\"properties\":{\"packet\":{\"recorded_at\":\"2015-09-02 04:45:45 +0000\",\"userId\":\"100000000000001\",\"meta\":{\"account\":\"xxx\",\"event\":\"track\"},\"fields\":{\"gyroData\":{\"rotation_y\":-1,\"rotation_z\":-1,\"rotation_x\":-1},\"accelerometerData\":{\"acceleration_x\":-1,\"acceleration_z\":-1,\"acceleration_y\":-1},\"location\":{\"speed\":4.68,\"speed_course\":0.7,\"horizontal_accuracy\":10,\"longtitude\":-122.02359082,\"vertical_accuracy\":-1,\"latitude\":37.33385024},\"pedometerData\":{\"step_count\":0}},\"recorded_sample_rate\":5}},\"geometry\":{\"type\":\"Point\",\"coordinates\":[37.33385024,-122.02359082]},\"type\":\"Feature\"}";

        final String str2 = "{\"properties\":{\"packet\":{\"recorded_at\":\"2015-09-02 04:45:45 +0000\",\"userId\":\"10000000000000111\",\"meta\":{\"account\":\"xxx\",\"event\":\"track\"},\"fields\":{\"gyroData\":{\"rotation_y\":-1,\"rotation_z\":-1,\"rotation_x\":-1},\"accelerometerData\":{\"acceleration_x\":-1,\"acceleration_z\":-1,\"acceleration_y\":-1},\"location\":{\"speed\":4.68,\"speed_course\":0.7,\"horizontal_accuracy\":10,\"longtitude\":-122.02359082,\"vertical_accuracy\":-1,\"latitude\":37.33385024},\"pedometerData\":{\"step_count\":0}},\"recorded_sample_rate\":5}},\"geometry\":{\"type\":\"Point\",\"coordinates\":[37.33385024,-122.02359082]},\"type\":\"Feature\"}";

//        boolean a = CompareJson.compareJsonComplete(str1, str2);
//        System.out.println(a);

        boolean b = CompareJson.compareJsonIgnoreNull(str1 , str2 , "userId");
        System.out.println(b);


    }

}
